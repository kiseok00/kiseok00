package com.itbank.javatutorials.day04;

import java.io.IOException;
import java.io.PrintWriter;

public class FileWriteQuiz {

	public static void main(String[] args) throws IOException {
		/*
		 * ���� ���� �ǽ�
		 * �л��� �̸�, Ű�� ��� �迭�� �־����� �� ������ ������ �����Ͻÿ�.
		 * docs ���͸� �� class.txt�� ����
		 * 
		 * �л��� ���� �� �� ���ٰ� ����. ��, �̸��� Ű�� ����ġ�� ���� ����� �ϴ��ϸ�Ī�� �Ǿ�����
		 * 
		 */
		String[] names= {"Jack","Rachel","Tom","Anna","Jenny"};
		int[] heights = {170,155,180,185,160};
		
		PrintWriter pw3 = new PrintWriter("C:\\Users\\Kgitbank\\Desktop\\docs\\class.txt");
		pw3.println("�̸� Ű");
		for(int i=0;i<names.length;i++) {
			String data = names[i];
			int k = heights[i];
			pw3.println(data+" "+k);
		}
		pw3.close();
		

	}

}
