package main;

public class SomaSequencial {
public static void main(String[] args) {
	int some = 0;
	int n = 1;
	while (some < 1000) {
		some += n;
		System.out.println(some-1 + "+" + n + "="+some);
	}
}
}
