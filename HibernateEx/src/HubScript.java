import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class HubScript {
	Connection connect = null;
	Connection connect1 = null;
   

	public static HashMap<Integer,Integer> nodeState= new HashMap<Integer,Integer>();
	
	public Connection createConnection(){
		 try {
	         Class.forName("com.mysql.jdbc.Driver");
	         connect = DriverManager.getConnection("jdbc:mysql://aws.cbmuqc9mcupo.us-east-1.rds.amazonaws.com:3306/AWS?" + "user=clouduser&password=cloud123");
	return connect;
	 } catch (Exception e) {
	       return null;  
	 } finally {
	         
	 }
	}

	public static void main(String[] args) {			
		HubScript hubScript= new HubScript();
		while(true){
			
			
		hubScript.changeSensorPosition();
			try{
			    Thread.sleep(10000);
			}catch(InterruptedException e){
			    System.out.println("Script got interrupted!");
			}
		}	
			}
	
	
public void changeSensorPosition(){
	 Statement statement = null;
	    PreparedStatement pstatement = null;
	    ResultSet resultSet = null;
	    PreparedStatement pstatement1 = null;
	    ResultSet resultSet1 = null;
				int sensorId=-1;
				int counter=0;
				String cpuUtilization="2";
				double latitude=0.0d;
				double longitude=0.0d;
				String latitude1="";
				String longitude1="";
				
				
				connect=createConnection();
				connect1=createConnection();
				String queryString = "select sensor_id,latitude,longitude, cpu_utilization from sensor_node where instance_status='START' order by sensor_id desc";
				ResultSet rs=null;
				try {
					pstatement = connect.prepareStatement(queryString);
					rs=pstatement.executeQuery();
					while(rs.next()){
						sensorId=rs.getInt("sensor_id");
						latitude1=rs.getString("latitude");
						longitude1=rs.getString("longitude");
						cpuUtilization=rs.getString("cpu_utilization");
				
						if(nodeState.containsKey(sensorId)){
							counter=nodeState.get(sensorId);
						}else{
							counter=0;
						}
				counter=(++counter)%40;
				nodeState.put(sensorId, counter);
				counter++;
				System.out.println("sensorId ="+sensorId+" counter="+counter);
				try{
					latitude=Double.parseDouble(latitude1);
					longitude=Double.parseDouble(longitude1);

				} catch (Exception e) {	
					
				}
					double inc= 0.02033829588029;
					if((counter<=5) || (counter>25 && counter<=30)){
						latitude +=inc;
						try{
						if(Integer.parseInt(cpuUtilization)<50){
						cpuUtilization=Integer.toString((4 + (int)(Math.random() * 5)));
						}
						}catch(Exception e){
							System.out.println("Exception in cpuUtilization in changeSensorPosition");
						}	
						}
					else if((counter>5 && counter<=10) ||(counter>20 && counter<=25)){
						latitude -=inc;
						try{
							if(Integer.parseInt(cpuUtilization)<50){
								cpuUtilization=Integer.toString((11 + (int)(Math.random() * 5)));
							}
							}catch(Exception e){
								System.out.println("Exception in cpuUtilization in changeSensorPosition");
							}
					}
					else if((counter>10 && counter<=15)||(counter>35 && counter<=40)){
						longitude +=inc;
						try{
							if(Integer.parseInt(cpuUtilization)<50){
							cpuUtilization=Integer.toString((24 + (int)(Math.random() * 5)));
							}
							}catch(Exception e){
								System.out.println("Exception in cpuUtilization in changeSensorPosition");
							}
						}
					else if((counter>15 && counter<=20)|| (counter>30 && counter<=35)){
						longitude -=inc;	
						try{
							if(Integer.parseInt(cpuUtilization)<50){
							cpuUtilization=Integer.toString((44 + (int)(Math.random() * 5)));
							
							}
							}catch(Exception e){
								System.out.println("Exception in cpuUtilization in changeSensorPosition");
							}
						}
					
					System.out.print("Latitude for " +counter  );
					System.out.println(" : "+ latitude );
					System.out.print("Longtide for " +counter  );
					System.out.println(" : "+ longitude );
					
					
					
					String queryString1 = "update sensor_node set latitude=?, longitude=?, cpu_utilization=?  where sensor_id=?";
					int result=-1;
			try {
				pstatement1 = connect1.prepareStatement(queryString1);
				pstatement1.setString(1, Double.toString(latitude));
				pstatement1.setString(2, Double.toString(longitude));
				pstatement1.setString(3, cpuUtilization);
				pstatement1.setInt(4, sensorId);
				
				result=pstatement1.executeUpdate();
			        //System.out.println("result of insertNewNode query:-"+result);
			        pstatement1.close();
			} catch (SQLException e) {
	
				e.printStackTrace();
			} 								
			}				

		} catch (SQLException e) {

			e.printStackTrace();
		} finally{
			try {
				connect.close();
			} catch (Exception e) {
			}
			
			try {
				connect1.close();
			} catch (Exception e) {
			}
		}
			}
}
