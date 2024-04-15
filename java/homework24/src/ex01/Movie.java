package ex01;

class Movie implements Runnable {
//	로직구성
//	Runnable 인터페이스를 구현받는다
//	Thread 객체를 생성한다
//	영화이름을 받아올 필드를 생성한다
//	영화이름를 매개변수로 받는 생성자를 생성한다
//	쓰레드를 실행시킬 메소드를 생성한다
//	A상영관을 먼저 끝내고 다음 상영관의 영화를 상영하기위해 join()메소드를 생성하고 예외던지기를 사용한다
//	run() 메소드를 재정의하여 영화 상영중이라는 문구를 for문을 사용해 10번 출력하고 영화를 끝낸 후 다음 영화를 차례로 실행한다
//	try~catch문을 사용하여 오류 발생 시 영화를 중단시킨다 그렇지않을 시 영화를 정상적으로 끝마친다
	
	// 객체
	Thread thread = new Thread();
	
	// 필드
    String movieName;

    
    // 생성자
    public Movie(String movieName) {
        this.movieName = movieName;
        thread = new Thread(this, movieName);
    }

    // 메소드
    public void start() {
        thread.start();
    }

    public void join() throws InterruptedException {
        thread.join();
    }

    // run() 재정의
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(movieName + " 영화 상영중~");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(movieName + " 상영이 중단되었습니다.");
            }
        }
        System.out.println(movieName + " 영화 종료!!!!!");
    }
}

