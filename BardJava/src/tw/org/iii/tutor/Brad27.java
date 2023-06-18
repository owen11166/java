package tw.org.iii.tutor;

import tw.org.iii.classes.TWId;

public class Brad27 {
	public static void main(String[] args) {
		/*
		 boolean isRight=TWId.isRightId("N126243329");
		 System.out.println(isRight+" true");
		 boolean isRight1=TWId.isRightId("N126243328");
		 System.out.println(isRight1+" False");
		 */
		 //---------------------------------------------
		 var owen=new TWId();
		 System.out.println(owen.getId());
		 boolean isRight=TWId.isRightId(owen.getId());
		 System.out.println(isRight);
		 

		 // -----------------

		}

	}

