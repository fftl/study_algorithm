package com.bj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main_BJ_01002_S3_터렛 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());
		
		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int r1 = Integer.parseInt(st.nextToken());
			
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken()); 
			
			int cnt = 0;
			for(int i=0; i<=r1*r1; i++) {
				int nx = x1+i;
				int ny = y1+r1-i;
				int distance = Math.abs(nx-x2) + Math.abs(ny-y2);
				if(distance==r2) {
					cnt++;
				};
			}
			System.out.println(cnt);
		}
	}
}
