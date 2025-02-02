package com.jsp.jdbc.playerdb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
//Sub Class
public class playerDao 
{
	Scanner scanner=new Scanner(System.in);
	Connection connection=null;

	//case1:-insert operation
	public void addPlayer()
	{


		try {

			//step-1:-Load and Register
			Class.forName("com.mysql.cj.jdbc.Driver");

			//step=-2:-Connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_playerdb?user=root&password=Akash@2002");

			//step-3&4
			PreparedStatement ps=connection.prepareStatement("INSERT INTO player VALUES(?,?,?,?,?,?)");

			System.out.println("Enter The Player Id:- ");
			ps.setInt(1, scanner.nextInt());
			System.out.println("Enter The Player Name:- ");
			ps.setString(2,scanner.next());
			System.out.println("Enter The Player Age:- ");
			ps.setInt(3, scanner.nextInt());
			System.out.println("Enter The Player Country:- ");
			ps.setString(4,scanner.next());
			System.out.println("Enter The IPL Team Name:- ");
			ps.setString(5,scanner.next());
			System.out.println("Enter the IPL Salary:-");
			ps.setInt(6, scanner.nextInt());


			int rowinsert=ps.executeUpdate();
			if(rowinsert>0)
			{
				System.out.println(rowinsert+" SucessFully Added!!!");
			}
			else
			{
				System.out.println("Data not Insert");
			}	
		} 

		catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		finally {
			//step:6 connection closed   
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}


	//Case 2:- Select Operation
	public void findAllPlayerByCountry() 
	{
		try
		{

			//step-1:-Load and Register
			Class.forName("com.mysql.cj.jdbc.Driver");

			//step=-2:-Connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_playerdb?user=root&password=Akash@2002");			

			//Steps 3:- create statement 
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM  player where playercountry in(?)");
			System.out.println("Enter Country name:-");
			String country=scanner.next();
			ps.setString(1,country);
			//Steps 4-executed the query
			ResultSet rSet =ps.executeQuery();
			System.out.println("player Id\tplayer Name\tplayer Age\tplayer Country\tIpl team\tIpl Salary");
			while(rSet.next())
			{
				System.out.println(rSet.getInt(1)+"\t\t");
				System.out.println(rSet.getString(2)+"\t\t");
				System.out.println(rSet.getInt(3)+"\t\t");
				System.out.println(rSet.getString(4)+"\t\t");
				System.out.println(rSet.getString(5)+"\t\t");
				System.out.println(rSet.getInt(6)+"\t\t");
				System.out.println();
			}


		} 

		catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		finally {
			//step:6 connection closed   
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}


	//Case 3:-Select
	public void findAllPlayerByIPLTeam() 
	{

		try {
			//step-1:-Load and Register
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step=-2:-Connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_playerdb?user=root&password=Akash@2002");			
			//Steps 3:- create statement & //Steps 4-exicted the query
			PreparedStatement ps=connection.prepareStatement("SELECT * FROM  player where iplTeam in(?)");
			System.out.println("Enter IPL Team name:-");
			String country=scanner.next();
			ps.setString(1,country);

			ResultSet rSet =ps.executeQuery();
			System.out.println("player Id\tplayer Name\tplayer Age\tplayer Country\tIpl team\tIpl Salary");
			while(rSet.next())
			{
				System.out.println(rSet.getInt(1)+"\t\t");
				System.out.println(rSet.getString(2)+"\t\t");
				System.out.println(rSet.getInt(3)+"\t\t");
				System.out.println(rSet.getString(4)+"\t\t");
				System.out.println(rSet.getString(5)+"\t\t");
				System.out.println(rSet.getInt(6)+"\t\t");
				System.out.println();
			}





		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			//step:6 connection closed   
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}



	}

	//case 4
	public void findPlayerBetweenAge() 
	{
		try {
			//step-1:-Load and Register
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step=-2:-Connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_playerdb?user=root&password=Akash@2002");
			PreparedStatement ps=connection.prepareStatement("Select * from player where playerAge BETWEEN ? AND ?");
			System.out.println("Enter The Intial Age");
			ps.setInt(1, scanner.nextInt());
			System.out.println("Enter The Final Age");
			ps.setInt(2, scanner.nextInt());
			
			ResultSet rSet =ps.executeQuery();
			System.out.println("player Id\tplayer Name\tplayer Age\tplayer Country\tIpl team\tIpl Salary");
			while(rSet.next())
			{
				System.out.println(rSet.getInt(1)+"\t\t");
				System.out.println(rSet.getString(2)+"\t\t");
				System.out.println(rSet.getInt(3)+"\t\t");
				System.out.println(rSet.getString(4)+"\t\t");
				System.out.println(rSet.getString(5)+"\t\t");
				System.out.println(rSet.getInt(6)+"\t\t");
				System.out.println();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		finally {
			//step:6 connection closed   
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}
//case 5	
	
	//..............................................................................................................

	public void updatePlayerSalaryById()
	{
		//step-1:-Load and Register
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step=-2:-Connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_playerdb?user=root&password=Akash@2002");


//			//step-3&4
//			PreparedStatement ps=connection.prepareStatement("UPDATE player SET  iplSalary=5000000+ WHERE playerId in (?)");
//			System.out.println("Enter The Player Id:- ");
//			ps.setInt(1, scanner.nextInt());
//			//Step 4:- Executed the Query
//			int rowupdate=ps.executeUpdate();
//
//			//step 5:- Process The Result
//			if(rowupdate>0)
//			{
//				System.out.println(rowupdate+" SucessFully Update!!!");
//			}
//			else
//			{
//				System.out.println("Update UncessFull Pls Again Try!!!");
//			}
			
			
			//First Fatch the Data
			PreparedStatement ps=connection.prepareStatement("Select * from player where playerId = ?");
			System.out.println("Enter The Player Id");
			ps.setInt(1, scanner.nextInt());		
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				int playersId=rs.getInt("playerId");
				int currentSal=rs.getInt("iplSalary");
				//Update satement Write
				ps=connection.prepareStatement("UPDATE player SET iplSalary=? where playerId=?");
				ps.setInt(1, currentSal+9000);
				ps.setInt(2, playersId);
				ps.execute();
			}
			
			

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	public void updatePlayerSalaryBetweenAge()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_playerdb?user=root&password=Akash@2002");


			//First Fatch the Data
			PreparedStatement ps=connection.prepareStatement("Select * from player where playerAge BETWEEN ? AND ?");
			System.out.println("Enter The Intial Age");
			ps.setInt(1, scanner.nextInt());
			System.out.println("Enter The Final Age");
			ps.setInt(2, scanner.nextInt());
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next())
			{
				int playersId=rs.getInt("playerId");
				int currentSal=rs.getInt("iplSalary");
				//Update satement Write
				ps=connection.prepareStatement("UPDATE player SET iplSalary=? where playerId=?");
				ps.setInt(1, currentSal+50000);
				ps.setInt(2, playersId);
				ps.execute();
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
             

	public void deleteAllPlayerByCountry()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step=-2:-Connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_playerdb?user=root&password=Akash@2002");

			//step-3&4
			PreparedStatement ps=connection.prepareStatement("DELETE FROM  player WHERE playercountry in (?)");
			System.out.println("Enter The Country Name:- ");
			ps.setString(1, scanner.nextLine());

			//step:5 
			boolean res= ps.execute();
			//step:-6
			if(res==false) {
				System.out.println("Data Delete SucessFull !! ");
				System.out.println("but one disadvantage it is not count");
			}
			else {
				System.out.println("Data not insert");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//
	public void deletePlayerbyId()
	{
		//step-1:-Load and Register
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//step=-2:-Connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_playerdb?user=root&password=Akash@2002");

			//step-3&4
			PreparedStatement ps=connection.prepareStatement("DELETE FROM  player WHERE playerId =(?)");
			System.out.println("Enter The Player Id:- ");
			ps.setInt(1, scanner.nextInt());

			//step:5 
			boolean res= ps.execute();
			//step:-6
			if(res==false) {
				System.out.println("Data Delete SucessFull !! ");
				System.out.println("but one disadvantage it is not count");
			}
			else {
				System.out.println("Data not insert");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//...................................................................................................................................................

}
