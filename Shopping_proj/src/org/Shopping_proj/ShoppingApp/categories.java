package org.Shopping_proj.ShoppingApp;

import java.util.Scanner;

public class categories 
{
	public static void main(String[] args) 
	{
		//landing page
		System.out.println("Welcome To ShoppingAdda.com!!");
		System.out.println("Would you Like To Recharge your card?"
				+ "If yes then Opt 1 else 2");
		/*Selecting category*/
	       System.out.println("Shop by Categories:\n"
	       		+ "1.Clothing\n"
	       		+ "2.Footwear\n"
	       		+ "3.Electronic\n"
	       		+ "4.Exit");
	       Scanner sc=new Scanner(System.in);
	       int n=sc.nextInt();
	       
	       switch(n)
	       {   //Clothing Department
	    	   case 1:System.out.println("Welcome To Clothing Department!!");
	    	          //Selecting a brand
	                  System.out.println("Select a Brands:\n"
	                  		+ "1.Zara\n"
	                  		+ "2.H&M\n"
	                  		+ "3.Claires & keith\n"
	                  		+ "4.Exit\n");
	                  int brand=sc.nextInt();
	                  switch(brand) 
	                  {
	                  	case 1://ZARA
	                  		System.out.println("ZARA");
	                	  //Selecting gender
	                	  System.out.println("1.Men\n"
	                	  		+ "2.Women\n"
	                	  		+ "3.Exit");
	                	  int category=sc.nextInt();
	                	  switch(category)
	                	  {
	                		  case 1:
	                		         //selecting item for Men
	                	  			System.out.println("Enter The Item Num:\n"
	                		  		+ "1.Shirt/Tshirt/polo(Price=Rs.600)\n"
	                		  		+ "2.Jeans(Price=Rs.1000)\n"
	                		  		+ "3.Tie(Price=Rs.300)\n"
	                		  		+ "4.Traditional(Price=Rs.1500)\n"
	                		  		+ "5.Exit");
	                	  			int item=sc.nextInt();
	                	  			System.out.println("Item Choosed "+item);
	                	  			//Setting Price of each article
	                	  			int price;
	                	  			switch(item)
	                	  			{
	                	  			case 1:price=600;
	                	  					System.out.println("Enter The Quantity\n"
							  	      		+ "Maximum Quantity Can be 10 per Item!!"); 
	                	  					int Quantity1=sc.nextInt();
	                	  					System.out.println("Are you Sure?\n "
													+ "1.Yes\n"
													+ "2.No");
											int a=sc.nextInt();
											switch(a)
											{
											case 1:Quantity(Quantity1,price);
												   break;
											case 2:main(null);
													break;
											}
	                	  					
	                	  					break;
	                	  			case 2:price=1000;
	                	  					System.out.println("Enter The Quantity\n"
							  	      		+ "Maximum Quantity Can be 10 per Item!!"); 
	                	  					int Quantity2=sc.nextInt();
	                	  					System.out.println("Are you Sure?\n "
													+ "1.Yes\n"
													+ "2.No");
											int b=sc.nextInt();
											switch(b)
											{
											case 1:Quantity(Quantity2,price);
												   break;
											case 2:main(null);
													break;
											}
	                	  					
	                	  					break;
	                	  			case 3:price=300;
	                	  					System.out.println("Enter The Quantity\n"
							  	      		+ "Maximum Quantity Can be 10 per Item!!"); 
	                	  					int Quantity3=sc.nextInt();
	                	  					System.out.println("Are you Sure?\n "
													+ "1.Yes\n"
													+ "2.No");
											int c=sc.nextInt();
											switch(c)
											{
											case 1:Quantity(Quantity3,price);
												   break;
											case 2:main(null);
													break;
											}
	                	  					
	                	  					break;
	                	  			case 4:price=1500;
	                	  					System.out.println("Enter The Quantity\n"
							  	      		+ "Maximum Quantity Can be 10 per Item!!"); 
	                	  					int Quantity4=sc.nextInt();
	                	  					System.out.println("Are you Sure?\n "
													+ "1.Yes\n"
													+ "2.No");
											int e=sc.nextInt();
											switch(e)
											{
											case 1:Quantity(Quantity4,price);
												   break;
											case 2:main(null);
													break;
											}
	                	  					break;
	                	  			default:System.out.println("Invalid Input");
	                	  					main(null);
	                	  					break;
	                	  			}
	                	  			break;
	                	  
	                	     case 2:
	                			   //selecting item for women
	              	  				System.out.println("Enter The Item Num:\n"
	              	  						+ "1.Shirt/Tops/polo(Price=Rs.600)\n"
	              	  						+ "2.Jeans(Price=Rs.1000)\n"
	              	  						+ "3.Skirts(Price=Rs.1300)\n"
	              	  						+ "4.Traditional(Price=Rs.3500)\n"
	              	  						+ "5.Exit");
	              	  				int item1=sc.nextInt();
	              	  				System.out.println("Item Choosed "+item1);
	              	  				//Setting Price of each article
	              	  				int price1;
	              	  				switch(item1)
	              	  				{
	              	  				case 1:price1=600;
	              	  						System.out.println("Enter The Quantity\n"
	              	  						+ "Maximum Quantity Can be 10 per Item!!"); 
	              	  						int Quantity1=sc.nextInt(); 
	              	  					System.out.println("Are you Sure?\n "
												+ "1.Yes\n"
												+ "2.No");
										int a=sc.nextInt();
										switch(a)
										{
										case 1:Quantity(Quantity1,price1);
											   break;
										case 2:main(null);
												break;
										}
	              	  						
	              	  						break;
	              	  				case 2:price1=1000;
	              	  						System.out.println("Enter The Quantity\n"
	              	  						+ "Maximum Quantity Can be 10 per Item!!"); 
	              	  						int Quantity2=sc.nextInt(); 
	              	  					System.out.println("Are you Sure?\n "
												+ "1.Yes\n"
												+ "2.No");
										int d=sc.nextInt();
										switch(d)
										{
										case 1:Quantity(Quantity2,price1);
											   break;
										case 2:main(null);
												break;
										}
	              	  						break;
	              	  				case 3:price1=1300;
	              	  						System.out.println("Enter The Quantity\n"
	              	  						+ "Maximum Quantity Can be 10 per Item!!"); 
	              	  						int Quantity3=sc.nextInt(); 
	              	  					System.out.println("Are you Sure?\n "
												+ "1.Yes\n"
												+ "2.No");
										int c=sc.nextInt();
										switch(c)
										{
										case 1:Quantity(Quantity3,price1);
											   break;
										case 2:main(null);
												break;
										}
	              	  						break;
	              	  				case 4:price1=3500;
	              	  						System.out.println("Enter The Quantity\n"
	              	  						+ "Maximum Quantity Can be 10 per Item!!"); 
	              	  						int Quantity4=sc.nextInt(); 
	              	  					System.out.println("Are you Sure?\n "
												+ "1.Yes\n"
												+ "2.No");
										int b=sc.nextInt();
										switch(b)
										{
										case 1:Quantity(Quantity4,price1);
											   break;
										case 2:main(null);
												break;
										}
		                	  			    break;
		                	  		default:System.out.println("Invalid Input");
            	  							main(null);
            	  							break;
	              	  				}
	                		        break;
	                	  }break;
	                    case 2:    //H&M
	                			  System.out.println("H&M");
								  System.out.println("1.Men\n"
										  + "2.Women\n"
										  + "3.Exit");
								  int category1=sc.nextInt();
								     switch(category1)
								     {
								     case 1:
											//selecting item for Men
											System.out.println("Enter The Item Num:\n"
													+ "1.Shirt/Tshirt/polo(Price=Rs.1200)\n"
													+ "2.Jeans(Price=Rs.4000)\n"
													+ "3.Tie(Price=Rs.1300)\n"
													+ "4.Traditional(Price=Rs.2500)\n"
													+ "5.Exit");
													int item2=sc.nextInt();
													System.out.println("Item Choosed "+item2);
													//Setting Price of each article
													int price2;
													switch(item2)
													{
													case 1:price2=1200;
															System.out.println("Enter The Quantity\n"
											  	      		+ "Maximum Quantity Can be 10 per Item!!"); 
															int Quantity1=sc.nextInt();
															System.out.println("Are you Sure?\n "
																	+ "1.Yes\n"
																	+ "2.No");
															int a=sc.nextInt();
															switch(a)
															{
															case 1:Quantity(Quantity1,price2);
																   break;
															case 2:main(null);
																	break;
															}
															break;
													case 2:price2=4000;
															System.out.println("Enter The Quantity\n"
															+ "Maximum Quantity Can be 10 per Item!!"); 
															int Quantity2=sc.nextInt();
															System.out.println("Are you Sure?\n "
																	+ "1.Yes\n"
																	+ "2.No");
															int c=sc.nextInt();
															switch(c)
															{
															case 1:Quantity(Quantity2,price2);
																   break;
															case 2:main(null);
																	break;
															}
															break;
													case 3:price2=1300;
															System.out.println("Enter The Quantity\n"
											  	      		+ "Maximum Quantity Can be 10 per Item!!"); 
															int Quantity3=sc.nextInt();
															System.out.println("Are you Sure?\n "
																	+ "1.Yes\n"
																	+ "2.No");
															int b=sc.nextInt();
															switch(b)
															{
															case 1:Quantity(Quantity3,price2);
																   break;
															case 2:main(null);
																	break;
															}
															
															break;
													case 4:price2=2500;
															System.out.println("Enter The Quantity\n"
											  	      		+ "Maximum Quantity Can be 10 per Item!!"); 
															int Quantity4=sc.nextInt();
															System.out.println("Are you Sure?\n "
																	+ "1.Yes\n"
																	+ "2.No");
															int l=sc.nextInt();
															switch(l)
															{
															case 1:Quantity(Quantity4,price2);
																   break;
															case 2:main(null);
																	break;
															}
															
															break;
														default:System.out.println("Invalid Input");
				                	  							main(null);
				                	  							break;
													}
													break;
								     	case 2:	//selecting item for women
								     			System.out.println("Enter The Item Num:\n"
													+ "1.Shirt/Tops/polo(Price=Rs.1600)\n"
													+ "2.Jeans(Price=Rs.3000)\n"
													+ "3.Skirts(Price=Rs.2300)\n"
													+ "4.Traditional(Price=Rs.4500)\n"
													+ "5.Exit");
												int item3=sc.nextInt();
												System.out.println("Item Choosed "+item3);
												//Setting Price of each article
												int price3;
												switch(item3)
												{
												case 1:price3=1600;
														System.out.println("Enter The Quantity\n"
														+ "Maximum Quantity Can be 10 per Item!!"); 
														int Quantity2=sc.nextInt();
														System.out.println("Are you Sure?\n "
																+ "1.Yes\n"
																+ "2.No");
														int t=sc.nextInt();
														switch(t)
														{
														case 1:Quantity(Quantity2,price3);
															   break;
														case 2:main(null);
																break;
														}
														
														break;
												case 2:price3=3000;
														System.out.println("Enter The Quantity\n"
														+ "Maximum Quantity Can be 10 per Item!!"); 
														int Quantity3=sc.nextInt(); 
														System.out.println("Are you Sure?\n "
																+ "1.Yes\n"
																+ "2.No");
														int a=sc.nextInt();
														switch(a)
														{
														case 1:Quantity(Quantity3,price3);
															   break;
														case 2:main(null);
																break;
														}
														
														break;
												case 3:price3=2300;
														System.out.println("Enter The Quantity\n"
														+ "Maximum Quantity Can be 10 per Item!!"); 
														int Quantity4=sc.nextInt();
														System.out.println("Are you Sure?\n "
																+ "1.Yes\n"
																+ "2.No");
														int b=sc.nextInt();
														switch(b)
														{
														case 1:Quantity(Quantity4,price3);
															   break;
														case 2:main(null);
																break;
														}
														break;
												case 4:price3=4500;
														System.out.println("Enter The Quantity\n"
										  	      		+ "Maximum Quantity Can be 10 per Item!!"); 
														int Quantity5=sc.nextInt();
														System.out.println("Are you Sure?\n "
																+ "1.Yes\n"
																+ "2.No");
														int c=sc.nextInt();
														switch(c)
														{
														case 1:Quantity(Quantity5,price3);
															   break;
														case 2:main(null);
																break;
														}
														
														break;
												case 5:System.out.println("Thanks for choosing us!! Visit Again!!");
															main(null);
															break;
															
												default:System.out.println("Invalid Input");
		                	  							main(null);
		                	  							break;
												}
												break;
								     }break;
								     
							case 3:		//Claire & keith
			                			  System.out.println("Claire & keith");
			                			  System.out.println("1.Men\n"
			                					  + "2.Women\n"
			                					  + "3.Exit");
			                			  int category2=sc.nextInt();
										     switch(category2)
										     {
										     case 1:
													//selecting item for Men
													System.out.println("Enter The Item Num:\n"
															+ "1.Shirt/Tshirt/polo(Price=Rs.1500)\n"
															+ "2.Jeans(Price=Rs.2000)\n"
															+ "3.Tie(Price=Rs.500)\n"
															+ "4.Traditional(Price=Rs.6500)\n"
															+ "5.Exit");
															int item3=sc.nextInt();
															System.out.println("Item Choosed "+item3);
															//Setting Price of each article
															int price2;
															switch(item3)
															{
															case 1:price2=1500;
																	System.out.println("Enter The Quantity\n"
													  	      		+ "Maximum Quantity Can be 10 per Item!!"); 
													  	  			int Quantity2=sc.nextInt();
													  	  		System.out.println("Are you Sure?\n "
																		+ "1.Yes\n"
																		+ "2.No");
																int a=sc.nextInt();
																switch(a)
																{
																case 1:Quantity(Quantity2,price2);
																	   break;
																case 2:main(null);
																		break;
																}
													  	  			
													  	  			break;
															case 2:price2=2000;
																	System.out.println("Enter The Quantity\n"
													  	      		+ "Maximum Quantity Can be 10 per Item!!"); 
																	int Quantity3=sc.nextInt();
																	System.out.println("Are you Sure?\n "
																			+ "1.Yes\n"
																			+ "2.No");
																	int k=sc.nextInt();
																	switch(k)
																	{
																	case 1:Quantity(Quantity3,price2);
																		   break;
																	case 2:main(null);
																			break;
																	}
																	
																	break;
															case 3:price2=500;
																	System.out.println("Enter The Quantity\n"
													  	      		+ "Maximum Quantity Can be 10 per Item!!"); 
																	int Quantity4=sc.nextInt();
																	System.out.println("Are you Sure?\n "
																			+ "1.Yes\n"
																			+ "2.No");
																	int j=sc.nextInt();
																	switch(j)
																	{
																	case 1:Quantity(Quantity4,price2);
																		   break;
																	case 2:main(null);
																			break;
																	}
																	
																	break;
															case 4:price2=6500;
																	System.out.println("Enter The Quantity\n"
													  	      		+ "Maximum Quantity Can be 10 per Item!!"); 
																	int Quantity5=sc.nextInt();
																	System.out.println("Are you Sure?\n "
																			+ "1.Yes\n"
																			+ "2.No");
																	int i=sc.nextInt();
																	switch(i)
																	{
																	case 1:Quantity(Quantity5,price2);
																		   break;
																	case 2:main(null);
																			break;
																	}
																	
																	break;
															default:System.out.println("Invalid Input");
					                	  							main(null);
					                	  							break;
															}
												case 2:
													//selecting item for women
													System.out.println("Enter The Item Num:\n"
															+ "1.Shirt/Tops/polo(Price=Rs.1600)\n"
															+ "2.Jeans(Price=Rs.1200)\n"
															+ "3.Skirts(Price=Rs.1300)\n"
															+ "4.Traditional(Price=Rs.8500)\n"
															+ "5.Exit");
														int item2=sc.nextInt();
														System.out.println("Item Choosed "+item2);
														//Setting Price of each article
														int price3;
														switch(item2)
														{
														case 1:price3=1600;
																System.out.println("Enter The Quantity\n"
												  	      		+ "Maximum Quantity Can be 10 per Item!!"); 
																int Quantity2=sc.nextInt();
																System.out.println("Are you Sure?\n "
																		+ "1.Yes\n"
																		+ "2.No");
																int a=sc.nextInt();
																switch(a)
																{
																case 1:Quantity(Quantity2,price3);
																	   break;
																case 2:main(null);
																		break;
																}
																
																break;
														case 2:price3=1200;
																System.out.println("Enter The Quantity\n"
												  	      		+ "Maximum Quantity Can be 10 per Item!!"); 
																int Quantity3=sc.nextInt();
																System.out.println("Are you Sure?\n "
																		+ "1.Yes\n"
																		+ "2.No");
																int q=sc.nextInt();
																switch(q)
																{
																case 1:
																	Quantity(Quantity3,price3);
																	break;
																case 2:main(null);
																		break;
																}
														case 3:price3=1300;
																System.out.println("Enter The Quantity\n"
												  	      		+ "Maximum Quantity Can be 10 per Item!!"); 
																int Quantity4=sc.nextInt();
																System.out.println("Are you Sure?\n "
																		+ "1.Yes\n"
																		+ "2.No");
																int r=sc.nextInt();
																switch(r)
																{
																case 1:Quantity(Quantity4,price3);
																	   break;
																case 2:main(null);
																		break;
																}
														case 4:price3=8500;
														System.out.println("Enter The Quantity\n"
												  	      		+ "Maximum Quantity Can be 10 per Item!!"); 
																int Quantity5=sc.nextInt();
																System.out.println("Are you Sure?\n "
																		+ "1.Yes\n"
																		+ "2.No");
																int s=sc.nextInt();
																switch(s)
																{
																case 1:Quantity(Quantity5,price3);
																	   break;
																case 2:main(null);
																		break;
																}
																break;
														default:System.out.println("Invalid Input");
				                	  							main(null);
				                	  							break;
														}
														break;
										     }
										     break;
							case 4:			//EXIT
										System.out.println("Thanks FOr choosing us");
										main(null);
										break;
							default:System.out.println("Invalid Input");
    	  							main(null);
    	  							break;
	                  }break;
	     //Footwear Department
    case 2:        System.out.println("Welcome To Footwear Department!!");
                          	//Selecting gender
                          	System.out.println("1.Men\n"
                  	  		+ "2.Women\n"
                  	  		+ "3.Exit");
                          	int category1=sc.nextInt();
                          	switch(category1)
                    	  		{
                          	//men
                          	case 1: {//selecting item
                    	  			System.out.println("Enter The Item Num:\n"
                    		  		+ "1.Flats(Price=Rs.1600)\n"
                    		  		+ "2.Formal_shoes(Price=Rs.1000)\n"
                    		  		+ "3.Flip-Flops(Price=Rs.300)\n"
                    		  		+ "4.Sneakers(Price=Rs.1500)\n"
                    		  		+ "5.Exit");
                    	  			int item1=sc.nextInt();
                    	  			System.out.println("Item Choosed "+item1);
                    	  				//Setting Price of each article
                    	  				int price1;
                    	  				switch(item1)
                    	  				{
                    	  				case 1:price1=600;
                    	  						System.out.println("Enter The Quantity\n"
                    	  						+ "Maximum Quantity Can be 10 per Item!!"); 
                    	  						int Quantity2=sc.nextInt(); 
                    	  						System.out.println("Are you Sure?\n "
														+ "1.Yes\n"
														+ "2.No");
												int a=sc.nextInt();
												switch(a)
												{
												case 1:Quantity(Quantity2,price1);
													   break;
												case 2:main(null);
														break;
												}
                    	  						break;
                    	  				case 2:price1=1000;
                    	  						System.out.println("Enter The Quantity\n"
                    	  						+ "Maximum Quantity Can be 10 per Item!!"); 
                    	  						int Quantity3=sc.nextInt(); 
                    	  						System.out.println("Are you Sure?\n "
														+ "1.Yes\n"
														+ "2.No");
												int h=sc.nextInt();
												switch(h)
												{
												case 1:Quantity(Quantity3,price1);
													   break;
												case 2:main(null);
														break;
												}
                    	  						break;
                    	  				case 3:price1=300;
                    	  						System.out.println("Enter The Quantity\n"
	                          	      		+ "Maximum Quantity Can be 10 per Item!!"); 
	                          	  			int Quantity4=sc.nextInt();
	                          	  		System.out.println("Are you Sure?\n "
												+ "1.Yes\n"
												+ "2.No");
										int g=sc.nextInt();
										switch(g)
										{
										case 1:Quantity(Quantity4,price1);
											   break;
										case 2:main(null);
												break;
										}
	                          	  				
                    	  							break;
                    	  				case 4:price1=1500;
                    	  						System.out.println("Enter The Quantity\n"
                    	  						+ "Maximum Quantity Can be 10 per Item!!"); 
                    	  						int Quantity5=sc.nextInt(); 
                    	  						System.out.println("Are you Sure?\n "
														+ "1.Yes\n"
														+ "2.No");
												int e=sc.nextInt();
												switch(e)
												{
												case 1:Quantity(Quantity5,price1);
													   break;
												case 2:main(null);
														break;
												}
                    	  						
                    	  						break;
                    	  				case 5:System.out.println("Thanks for visiting us!!");
                	  							main(null);
                	  							break;
                	  					default:System.out.println("Invalid Input");
                	  							main(null);
                	  							break;
                    	  				}
                          		    
                          	     }break;
                          		   //women
                    	  		case 2:{
                    		         //selecting item
                    	  			System.out.println("Enter The Item Num:\n"
                    		  		+ "1.Wedges(Price=Rs.1600)\n"
                    		  		+ "2.Flats(Price=Rs.1000)\n"
                    		  		+ "3.Flip-Flops(Price=Rs.300)\n"
                    		  		+ "4.Heels(Price=Rs.1500)\n"
                    		  		+ "5.Exit");
                    	  			int item2=sc.nextInt();
                    	  			System.out.println("Item Choosed "+item2);
                    	  			//Setting Price of each article
                    	  			int price2;
                    	  			switch(item2)
                    	  			{
                    	  			case 1:price2=1600;
                    	  		System.out.println("Enter The Quantity\n"
                        	      		+ "Maximum Quantity Can be 10 per Item!!"); 
                        	  			int Quantity2=sc.nextInt(); 
                        	  			System.out.println("Are you Sure?\n "
												+ "1.Yes\n"
												+ "2.No");
										int a=sc.nextInt();
										switch(a)
										{
										case 1:Quantity(Quantity2,price2);
											   break;
										case 2:main(null);
												break;
										}
                        	  			break;
                    	  			case 2:price2=1000;
                    	  		System.out.println("Enter The Quantity\n"
                        	      		+ "Maximum Quantity Can be 10 per Item!!"); 
                        	  			int Quantity3=sc.nextInt();
                        	  			System.out.println("Are you Sure?\n "
												+ "1.Yes\n"
												+ "2.No");
										int e=sc.nextInt();
										switch(e)
										{
										case 1:Quantity(Quantity3,price2);
											   break;
										case 2:main(null);
												break;
										}
                        	  			break;
                    	  			case 3:price2=300;
                    	  		System.out.println("Enter The Quantity\n"
                        	      		+ "Maximum Quantity Can be 10 per Item!!"); 
                        	  			int Quantity4=sc.nextInt(); 
                        	  			System.out.println("Are you Sure?\n "
												+ "1.Yes\n"
												+ "2.No");
										int f=sc.nextInt();
										switch(f)
										{
										case 1:Quantity(Quantity4,price2);
											   break;
										case 2:main(null);
												break;
										}
                        	  			break;
                    	  			case 4:price2=1500;
                    	  		System.out.println("Enter The Quantity\n"
                        	      		+ "Maximum Quantity Can be 10 per Item!!"); 
                        	  			int Quantity5=sc.nextInt(); 
                        	  			System.out.println("Are you Sure?\n "
												+ "1.Yes\n"
												+ "2.No");
										int d=sc.nextInt();
										switch(d)
										{
										case 1:Quantity(Quantity5,price2);
											   break;
										case 2:main(null);
												break;
										}
                        	  			break;
                    	  			case 5:System.out.println("Thanks for visiting us!!");
                    	  					main(null);
                    	  					break;
                    	  			default:System.out.println("Invalid Input");
            	  					        main(null);
            	  					        break;
                    	  			}break;
                    	  		}
                    	  case 4:	//EXIT
								System.out.println("Thanks FOr choosing us");
								main(null);
								break;
						default:System.out.println("Invalid Input");
	  							main(null);
	  							break;
            }break;
                    	  		
          		          
                          	//Electronics Dept
                          	
                case 3:	System.out.println("Welcome To Electronics Department!!");
        			//Selecting a category
                		System.out.println("Select a Product:\n"
                				+ "1.Mobile\n"
                				+ "2.Washing Machine\n"
                				+ "3.Laptop\n"
                				+ "4.Exit");
                			int product=sc.nextInt();
                			switch(product) 
                			{
                			case 1:{
                						System.out.println("Mobiles");
                						System.out.println("1.Sony(Rs.32000)\n"
                					          + "2.Apple(Rs.80000)\n"
                					          + "3.Pixel(Rs.44000)"
                					          + "4.Exit");
                						int set=sc.nextInt();
                						switch(set)
                						{
                						case 1:int price = 32000;
                								System.out.println("Enter The Quantity\n"
                								+ "Maximum Quantity Can be 10 per Item!!"); 
                								int Quantity1=sc.nextInt();
                								System.out.println("Are you Sure?\n "
														+ "1.Yes\n"
														+ "2.No");
												int a=sc.nextInt();
												switch(a)
												{
												case 1:Quantity(Quantity1,price);
													   break;
												case 2:main(null);
														break;
												}
                								break;
                						case 2:price=80000;
                						System.out.println("Enter The Quantity\n"
                								+ "Maximum Quantity Can be 10 per Item!!"); 
                								int Quantity2=sc.nextInt();
                								System.out.println("Are you Sure?\n "
														+ "1.Yes\n"
														+ "2.No");
												int d=sc.nextInt();
												switch(d)
												{
												case 1:Quantity(Quantity2,price);
													   break;
												case 2:main(null);
														break;
												}
                								break;
                						case 3:price=44000;
                						System.out.println("Enter The Quantity\n"
                								+ "Maximum Quantity Can be 10 per Item!!"); 
                								int Quantity3=sc.nextInt();
                								System.out.println("Are you Sure?\n "
														+ "1.Yes\n"
														+ "2.No");
												int c=sc.nextInt();
												switch(c)
												{
												case 1:Quantity(Quantity3,price);
													   break;
												case 2:main(null);
														break;
												}
                								break;
                						case 4:System.out.println("Thankyou for choosing us!");
                						       main(null);
                						       break;
                						default:System.out.println("Invalid Input");
                	  							main(null);
                	  							break;
                						}
                			     }
                				break;
                			case 2:{
                				System.out.println("Washing Machines");
        						System.out.println("1.IFB(Rs.32000)\n"
        					          + "2.LG(Rs.25000)\n"
        					          + "3.Whirlpool(Rs.21000)"
        					          + "4.Exit");
        						int set=sc.nextInt();
        						switch(set)
        						{
        						case 1:int price = 32000;
        								System.out.println("Enter The Quantity\n"
        								+ "Maximum Quantity Can be 10 per Item!!"); 
        								int Quantity1=sc.nextInt();
        								System.out.println("Are you Sure?\n "
												+ "1.Yes\n"
												+ "2.No");
										int a=sc.nextInt();
										switch(a)
										{
										case 1:Quantity(Quantity1,price);
											   break;
										case 2:main(null);
												break;
										}
        								break;
        						case 2:price=25000;
        						System.out.println("Enter The Quantity\n"
        								+ "Maximum Quantity Can be 10 per Item!!"); 
        								int Quantity2=sc.nextInt();
        								System.out.println("Are you Sure?\n "
												+ "1.Yes\n"
												+ "2.No");
										int f=sc.nextInt();
										switch(f)
										{
										case 1:Quantity(Quantity2,price);
											   break;
										case 2:main(null);
												break;
										}
        								break;
        						case 3:price=21000;
        						System.out.println("Enter The Quantity\n"
        								+ "Maximum Quantity Can be 10 per Item!!"); 
        								int Quantity3=sc.nextInt();
        								System.out.println("Are you Sure?\n "
												+ "1.Yes\n"
												+ "2.No");
										int e=sc.nextInt();
										switch(e)
										{
										case 1:Quantity(Quantity3,price);
											   break;
										case 2:main(null);
												break;
										}
        								break;
        						case 4:System.out.println("Thankyou for choosing us!");
        						       main(null);
        						       break;
        						default:System.out.println("Invalid Input");
        	  							main(null);
        	  							break;
        						}
                		    }
                			break;
                			case 3:{
                				System.out.println("Laptop");
        						System.out.println("1.Dell(Rs.70000)\n"
        					          + "2.Apple(Rs.100000)\n"
        					          + "3.Asus(Rs.41000)"
        					          + "4.Exit");
        						int set=sc.nextInt();
        						switch(set)
        						{
        						case 1:int price = 70000;
        								System.out.println("Enter The Quantity\n"
        								+ "Maximum Quantity Can be 10 per Item!!"); 
        								int Quantity1=sc.nextInt();
        								System.out.println("Are you Sure?\n "
												+ "1.Yes\n"
												+ "2.No");
										int a=sc.nextInt();
										switch(a)
										{
										case 1:Quantity(Quantity1,price);
											   break;
										case 2:main(null);
												break;
										}
        								break;
        						case 2:price=100000;
        						System.out.println("Enter The Quantity\n"
        								+ "Maximum Quantity Can be 10 per Item!!"); 
        								int Quantity2=sc.nextInt();
        								System.out.println("Are you Sure?\n "
												+ "1.Yes\n"
												+ "2.No");
										int c=sc.nextInt();
										switch(c)
										{
										case 1:Quantity(Quantity2,price);
											   break;
										case 2:main(null);
												break;
										}
        								break;
        						case 3:price=41000;
        						System.out.println("Enter The Quantity\n"
        								+ "Maximum Quantity Can be 10 per Item!!"); 
        								int Quantity3=sc.nextInt();
        								System.out.println("Are you Sure?\n "
												+ "1.Yes\n"
												+ "2.No");
										int d=sc.nextInt();
										switch(d)
										{
										case 1:Quantity(Quantity3,price);
											   break;
										case 2:main(null);
												break;
										}
        								
        						case 4:System.out.println("Thankyou for choosing us!");
        						       main(null);
        						       break;
        						default:System.out.println("Invalid Input");
        	  							main(null);
        	  							break;
        						}
                			  }break;
                			}break;
            case 4:{
                	System.out.println("Thanks for visiting us!!");
                	main(null);
                	}break;
                	
            default:System.out.println("Invalid Input");
						main(null);break;
                	}
                }
	
	       public static void Cost(int quantity, int price) 
	   	{
	   		int Tp=quantity*price;
	   		double avg=6/100;
	   		double CGST=avg*(quantity*price);
	   		System.out.println(CGST);
	   		double SGST=avg*(quantity*price);
	   		System.out.println(SGST);
	   		double Total=Tp+CGST+SGST;
	   		System.out.println(Total);
	   		System.out.println("Thanks for choosing us!!");
	   		System.out.println("Visit again!!");
	   	}
	   	public static void Quantity(int Quantity1,int price)
	   	{
	   		    if(Quantity1<1 || Quantity1>10)
	   			{
	   				main(null);
	   			}
	   			else
	   			{
	   				Cost(Quantity1,price);
	   			}
	   	}

}
