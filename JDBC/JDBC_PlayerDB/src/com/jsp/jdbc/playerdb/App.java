package com.jsp.jdbc.playerdb;

import java.util.Scanner;

import com.jsp.jdbc.playerdb.dao.playerDao;

//Base Class
public class App {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			playerDao  pDao=new playerDao();



			while(true)
			{
				//Menu

				System.out.println("1:Add Player");
				System.out.println("2:Find All Player By Country");
				System.out.println("3:Find All Player By IPLTeam");
				System.out.println("4:Find All Player By BetweenAge");
				System.out.println("5:Update Player Salary By Id");
				System.out.println("6:Update Player Salary Between Age");
				System.out.println("7:Delete All  Player by Country Name");
				System.out.println("8:Delete Player by Id");
				System.out.println("9:Exit");
				

				System.out.println("Enter The Chosee");
				int choice=sc.nextInt();

				if(choice>=1 && choice<=8)
					//swich case proposed
					switch(choice)
					{
					case 1:pDao.addPlayer();
					break;
					case 2:pDao.findAllPlayerByCountry();
					break;
					case 3:pDao.findAllPlayerByIPLTeam();
					break;
					case 4:pDao.findPlayerBetweenAge();
					break;
					case 5:pDao.updatePlayerSalaryById();
					break;
					case 6:pDao.updatePlayerSalaryBetweenAge();
					break;
					case 7:pDao.deleteAllPlayerByCountry();
					break;
					case 8:pDao.deletePlayerbyId();
					break;
					case 9:
						System.out.println("Thank You !!! You Exit  The Project");
						System.exit(0);
					
					default: System.out.println("Invalid number");
					}


			}
		}
	}

}
