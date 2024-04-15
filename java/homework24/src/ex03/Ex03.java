package ex03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
//		로직구성
//		ArrayList import
//		20글자 이상의 문자열을 임의로 생성 후 리스트에 추가
//		중복되지 않을 단어를 저장 할 HashSet import
//		리스트의 각 문자열에 중복되지 않는 단어 세는 이중 for문 작성
//		중복되지 않는 단어의 개수 출력
		
		ArrayList<String> strings = new ArrayList<>();
		
		strings.add("dkdkdkdkdkdkdodkdkdkdkdkkkq");
		
		Set<String> words2 = new HashSet<>();
		
		for(String str : strings) {
			String[] words = str.split("\\s+");
			for(String word : words) {
				words2.add(word);
			}
		}
		System.out.println("중복되지않는 단어의 개수 : " + words2.size());
	}
}
