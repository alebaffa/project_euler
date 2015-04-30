package com.euler.project;

import java.math.BigInteger;

public class Problem8 {

	public static void main(String[] args) {
		String numbers = "73167176531330624919225119674426574742355349194934969835203127745063262395783180169848018"
				+ "694788518438586156078911294949545950173795833195285320880551112540698747158523863050715693290963"
				+ "295227443043557668966489504452445231617318564030987111217223831136222989342338030813533627661428"
				+ "280644448664523874930358907296290491560440772390713810515859307960866701724271218839987979087922"
				+ "749219016997208880937766572733300105336788122023542180975125454059475224352584907711670556013604"
				+ "839586446706324415722155397536978179778461740649551492908625693219784686224828397224137565705605"
				+ "749026140797296865241453510047482166370484403199890008895243450658541227588666881164271714799244"
				+ "429282308634656748139191231628245861786645835912456652947654568284891288314260769004224219022671"
				+ "055626321111109370544217506941658960408071984038509624554443629812309878799272442849091888458015"
				+ "616609791913387549920052406368991256071760605886116467109405077541002256983155200055935729725716"
				+ "36269561882670428252483600823257530420752963450";

		BigInteger max = new BigInteger(Integer.toString(0));

		for (int i = 0; i < numbers.length()-13; i++) {
			System.out.println("loop " + i);
			long one = numbers.charAt(i);
			long two = numbers.charAt(i+1);
			long three = numbers.charAt(i+2);
			long four = numbers.charAt(i+3);
			long five = numbers.charAt(i+4);
			long six = numbers.charAt(i+5);
			long seven =numbers.charAt(i+6);
			long eight = numbers.charAt(i+7);
			long nine =numbers.charAt(i+8);
			long ten = numbers.charAt(i+9);
			long eleven = numbers.charAt(i+10);
			long twelve = numbers.charAt(i+11);
			long thirteen = numbers.charAt(i+12);
			
			Long x = one * two * three * four * five * six * seven * eight
					* nine * ten * eleven * twelve * thirteen;

			BigInteger temp = new BigInteger(x.toString());
			System.out.println(one+"*"+two+"*"+three+"*"+four+"*"+five+"*"+six+"*"+seven+"*"+eight+"*"+nine+"*"+ten+"*"+eleven+"*"+twelve+"*"+thirteen+"\n");
			if (temp.compareTo(max) == 1) {
				max = temp;
				System.out.println("New max found: " + max);
			} else {
				System.out.println("\n");
			}
		}

		System.out.println("The max is: " + max);
	}
}
