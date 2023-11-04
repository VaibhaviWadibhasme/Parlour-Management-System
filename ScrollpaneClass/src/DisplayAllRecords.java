import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class DisplayAllRecords 
{
	static String rows[][] = new String[100][3];
	
	static int row =0;
	public static void display()
	{
		try
		{
			DAO db = new DAO();
			Connection conn = db.getConnection();
			
			String selectQuery = "select* from registration";
			
			PreparedStatement preparedStatement = conn.prepareStatement(selectQuery);
			
			ResultSet result = preparedStatement.executeQuery();
			
			while(result.next())
			{
				for (int i=0;i<3;i++)
					rows[row][i]= result.getString((i+1));
					row++;				
			}
			ViewCustomer.populateArray(rows);
//			ViewOneUser.populateArray();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) throws Exception
	{
		DisplayAllRecords.display();
	}
}
