package Battleship;

public class Validatorinator {
	private static String[][] arr;
	public Validatorinator(String[][] board) {
		arr = board;
	}
	public static boolean shipChecker() {
		boolean amountTrue = false;
		int ccount = 0;
		int bcount = 0;
		int	rcount = 0;
		int scount = 0;
		int dcount = 0;
		boolean cTrue = false;
		boolean bTrue = false;
		boolean rTrue = false;
		boolean srue = false;
		boolean dTrue = false;
		boolean chGood = false;
		boolean bhGood = false;
		boolean rhGood = false;
		boolean shGood = false;
		boolean dhGood = false;
		boolean cvGood = false;
		boolean bvGood = false;
		boolean rvGood = false;
		boolean svGood = false;
		boolean dvGood = false;
		boolean goodTrue = false;
		if (arr.length == 10 && arr[0].length == 10) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					if(arr[i][j].equals("C")) {
						ccount++;	
					}
					else if(arr[i][j].equals("B")) {
						bcount++;
					}
					else if(arr[i][j].equals("R")) {
						rcount++;
					}
					else if(arr[i][j].equals("S")) {
						scount++;
					}
					else if(arr[i][j].equals("D")) {
						dcount++;
					}
				}
			}
		}
		else {
			return false;
		}
		if(ccount == 5 && bcount == 4 && rcount == 3 && scount == 3 && dcount == 2) {
			amountTrue = true;
		}
		else {
			return false;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(arr[i][j].equals("C")) {
					if(arr[i][j + 1].equals("C")) {
						if(arr[i][j + 2].equals("C")) {
							if(arr[i][j + 3].equals("C")) {
								if(arr[i][j + 4].equals("C")) {
									chGood = true;
								}
								else {
								}
							}
							else {
							}
						}
						else {
						}
					}
					else {
					}
				}
				else {
				}
				if(arr[i][j].equals("B")) {
					if(arr[i][j + 1].equals("B")) {
						if(arr[i][j + 2].equals("B")) {
							if(arr[i][j + 3].equals("B")) {
								bhGood = true;
							}
							else {
							}
						}
						else {
						}
					}
					else {
					}
				}
				else {
				}
				if(arr[i][j].equals("R")) {
					if(arr[i][j + 1].equals("R")) {
						if(arr[i][j + 2].equals("R")) {
							rhGood = true;
						}
						else {
						}
					}
					else {
					}
				}
				else {
				}
				if(arr[i][j].equals("S")) {
					if(arr[i][j + 1].equals("S")) {
						if(arr[i][j + 2].equals("S")) {
							shGood = true;
						}
						else {
						}
					}
					else {
					}
				}
				else {	
				}
				if(arr[i][j].equals("D")) {
					if(arr[i][j + 1].equals("D")) {
						dhGood = true;
					}
					else {
						
					}
				}
				else {
				}
				if(arr[i][j].equals("C")) {
					if(arr[i + 1][j].equals("C")) {
						if(arr[i + 2][j].equals("C")) {
							if(arr[i + 3][j].equals("C")) {
								if(arr[i + 4][j].equals("C")) {
									cvGood = true;
								}
								else {
								}
							}
							else {
							}
						}
						else {
						}
					}
						else {	
						}
				}
				else {
				}
				if(arr[i][j].equals("B")) {
					if(arr[i + 1][j].equals("B")) {
						if(arr[i + 2][j].equals("B")) {
							if(arr[i + 3][j].equals("B")) {
								bvGood = true;
							}
							else {
							}
						}
						else {
						}
					}
					else {
					}
				}
				if(arr[i][j].equals("R")) {
					if(arr[i + 1][j].equals("R")) {
						if(arr[i + 2][j].equals("R")) {
							rvGood = true;
						}
						else {
						}
					}
					else {
					}
				}
				else {
				}
				if(arr[i][j].equals("S")) {
					if(arr[i + 1][j].equals("S")) {
						if(arr[i + 2][j].equals("S")) {
							svGood = true;
						}
						else {	
						}
					}
					else {
					}
				}
				else {
				}
				if(arr[i][j].equals("D")) {
					if(arr[i + 1][j].equals("D")) {
						dvGood = true;
					}
					else {
					}
				}
				else {
				}
			}
		}
		if((chGood || cvGood) && (bhGood || bvGood) && (rhGood || rvGood) && (shGood || svGood) && (dhGood || dvGood)) {
			goodTrue = true;
		}
		if(amountTrue && goodTrue) {
			return true;
		}
		return false;
	}
	public static boolean balanced(String[][] board) {
		arr = board;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(!(arr[i][j].equals("0"))){
					count++;
					if(!(arr[i][j + 1].equals("0"))){
						count++;
						if(!(arr[i][j + 2].equals("0"))){
							count++;
							if(!(arr[i][j + 3].equals("0"))){
								count++;
								if(!(arr[i][j + 4].equals("0"))){
									count++;
									if(!(arr[i][j + 5].equals("0"))){
										count++;
										if(!(arr[i][j + 6].equals("0"))){
											count++;
											if(!(arr[i][j + 7].equals("0"))){
												count++;
												if(!(arr[i][j + 8].equals("0"))){
													count++;
													if(!(arr[i][j + 9].equals("0"))){
														count++;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				if(count >= 2) {
					return false;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(!(arr[i][j].equals("0"))){
					count++;
					if(!(arr[i + 1][j].equals("0"))){
						count++;
						if(!(arr[i + 2][j].equals("0"))){
							count++;
							if(!(arr[i + 3][j].equals("0"))){
								count++;
								if(!(arr[i + 4][j].equals("0"))){
									count++;
									if(!(arr[i + 5][j].equals("0"))){
										count++;
										if(!(arr[i + 6][j].equals("0"))){
											count++;
											if(!(arr[i + 7][j].equals("0"))){
												count++;
												if(!(arr[i + 8][j].equals("0"))){
													count++;
													if(!(arr[i + 9][j].equals("0"))){
														count++;
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				if(count >= 2) {
					return false;
				}
			}
		}
		return true;
	}
}