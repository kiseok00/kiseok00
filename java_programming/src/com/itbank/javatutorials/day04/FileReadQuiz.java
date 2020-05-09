package com.itbank.javatutorials.day04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileReadQuiz {

	public static void main(String[] args) throws IOException {
		//공유폴더 경로에 업로드된 Congress.txt 파일
		//당선인+당선지역
		//이 파일을 읽어서 당선인 이름과 당선지역 사이에 " " (공백) 구분자를 넣어서
		//새로운 파일 생성
		//새로운 파일의 이름은 Congress_edit.txt로 docs디렉터리 하단에 저장
		
		
		BufferedReader br =new BufferedReader(new FileReader("\\\\DESKTOP-UM5HDJL\\Users\\KGITBANK\\Desktop\\Workspace\\Congress.txt"));
		PrintWriter pw = new PrintWriter("C:\\Users\\Kgitbank\\Desktop\\docs\\Congress_edit.txt");
		while(true) { //조건문이 true이기 때문에 무한반복되는 while
			String line = br.readLine(); //readLine 메소드 이용
			if(line == null) {
				break;
			}
			//이름과 당선지역을" "으로 구분
			// substring :문자열에서 몇개의 문자부분만 자를때 사용
			String name = line.substring(0,3); //시작인데스 <= < 마지막 인덱스
			String area = line.substring(3); // 명시된 인덱스~ 끝까지
			String data = name + " "+ area;
			pw.println(data);
			System.out.println(data);
			
			
			
			
			}
			br.close();
			pw.close();
			

			
			
		
		
		
		
		
		
		
		
		
	}

}
