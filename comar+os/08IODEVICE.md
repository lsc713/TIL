장치컨트롤러(입출력제어기,입출력모듈라고도함) - H/W통로
1.cpu와 iodevice간 통신중계
2.오류검출
3.데이터버퍼링의 기능을

컨틀롤러안에는 데이터레지스터(버퍼역할) 상태레지스터 제어레지스터가 있음

장치 드라이버(S/W통로)
메모리에서 장치콘트롤러가 컴퓨터내부와 정보를 주고받을 수 있게하는 프로그램

=============
입출력 방법
1.프로그램입출력
프로그램속 명령어로 입출력작업을 하는 방식
컨트롤러를 통해 읽고쓴다면 그 방식은
(1)메모리 맵 입출력
메모리를위한 주소공간과 입출력을 위한 주소공간을 하나의 주소공간으로 간주하여
메모리에 접근하는 명령어와 입출력장치에 접근하는 명령어가 다르지 않다
(2)고립형 입출력
메모리를위한 주소공간과 입출력을 위한 주소공간을 분리하는방법
입출력명령어가 다름.


2.인터럽트기반입출력

명령에 따른 인터럽트요청으로 서비스루틴의 실행
다만 여러개의 장치에서 인터럽트를 요청하는 경우 programmable interrupt controller PIC를 통해 우선순위를 판별
PIC는 계층적으로 구성

3.DMA입출력

![세피로트](data:image/png;base64,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)

direct memory acess로 cpu가 입출력장치주소및연산이나 메모리주소를 주면 그걸 대신 수행해서 cpu에 인터럽트를보냄(하청)
다만 시스템버스를 사용하기때문에 cpu한테 방해안되게씀(사이클 스틸링)
이 경우 시스템버스를 두번씩은쓰기때문에 DMA컨트롤러(H/W임)와 입출력장치컨트롤러사이에 입출력버스를 별도로 연결해 시스템버스이용빈도를 줄인다.

