package day4.secondpackage;
import day4.base;

public class Executer {
	public static void main(String[] args) {
		// accessing different package class
		base b1 = new base();

		// private, default and protected members can't access

		/*
		 * b1.varPrivate=21; b1.methodPrivate(); b1.varDefault=11; b1.methodDefault();
		 * b1.varProtected=31; b1.methodProtected();
		 */

		b1.methodPublic();
		b1.varPublic = 41;
		b1.methodPublic();
	}
}
