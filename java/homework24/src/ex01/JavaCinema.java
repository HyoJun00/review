package ex01;

public class JavaCinema {
    public static void main(String[] args) {
//    	로직구성
//    	각 영화를 상영할 movie 객체 생성
//    	try~catch문 안에 메소드를 사용하여 각 영화를 상영하고 예외 발생 시 "문제가 발생했습니다" 출력
    	
        Movie movieA = new Movie("서울의 봄");
        Movie movieB = new Movie("나폴레옹");
        Movie movieC = new Movie("3일의 휴가");

        try {
            movieA.start(); // A관 영화 시작
            movieA.join();  // A관 영화가 끝날 때까지 기다림

            movieB.start(); // B관 영화 시작
            movieB.join();  // B관 영화가 끝날 때까지 기다림

            movieC.start(); // C관 영화 시작
            movieC.join();  // C관 영화가 끝날 때까지 기다림
        } catch (InterruptedException e) {
            System.out.println("영화 상영에 문제가 발생했습니다.");
        }
    }
}