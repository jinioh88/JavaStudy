#객체지향
## 클래스와 객체
  - 객체와 인스턴스
    - 클래스로부터 객체를 만드는 과정을 클래스의 인스턴스화 라한다. 
    - 클래스로부터 만들어진 객체를 그 클래스의 인스턴스라 한다. 
    >   
        Tv t; // TV클래스의 인스턴수 변수 t 선언.
        t = new Tv(); // TV인스턴스 생성하고 생성된 TV객체의 주소를 t에 저장
    - 연산자 new에 의해 TV 클래스의 인스턴스가 메모리의 빈 공간에 생성된다. 
    - 대입 연산자 '='에 의해 생성된 객체의 주소값이 참조 변수 t에 저장된다. 
    - 참조변수 t를 통해 TV 인스턴스에 접근할 수 있다. 
  
  - 객체 배열
    - 객체 배열 안에 객체가 저장되는 것이 아닌, 객체의 주소가 저장된다. 
    >   
        // 위 3개의 배열에 객체의 주소가 저장되는데 기본값은 null이다. 
        // 아직 객체가 안 만들어진 상태임. 찹조 변수만 만들어져있은거임.
        TV tv1, tv2, tv3;  ---> TV[] tvArr = new TV[3];
        
        // 객체 생성
        tvArr[0] = new TV();  tvArr[3] = new TV();  tvArr[2] = new TV();
        
        // 위 과정을 한번에 할 수 있음.
        TV[] tvArr = { new TV(),new TV(),new TV() };
        
        // 다뤄야할 객체가 많으면 for 문 이용
        for(int i=0; i<tvArr.length; i++)
            tvArr[i] = new TV();
        
## 변수와 메서드
  - 선언 위치에 따른 변수 종류
    1) 클래스 변수 
        - 멤버변수, static과 함께 클래스 영역에 선언된 변수. 클래스가 메모리에 올라갈 때 생성.
        - 모든 인스턴스가 공통된 저장공간을 공유한다. 
        - 인스턴스 생성없이 사용할 수 있다. 
    2) 인스턴스 변수 
        - 멤버변수, static이 붙지않은 클래스 영역에 선언된 변수, 인스턴스가 생성되었을때(new) 생성.
        - 인스턴스는 서로 독립된 저장 공간을 가져서, 서로 다른 값 가질 수 있다. 
    3) 지역변수
        - 클래스 영역 이외의 영역에 선언. 변수 선언문이 실행됬을 때 생성.       
  