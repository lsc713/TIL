# EC2


## 1 EC2란

- 간편하게 필요한 용량을 구성하여 검증된 컴퓨팅 인프라에서 실행가능.
- 인스턴스 획득에 시간 얼마안걸리고 장애에 대한 뛰어난 복원력

## 2 EC2의 가격정책

- On-Demand 시간 또는 초당 가격지불(약정필요없고 유연하게 사용)
- Spot Instance 남는 인스턴스를 저렴하게 구매해서 쓰되 언제 내줄지 모름 ㅋㅋ
- 예약 인스턴스 : 수요예측이 확실할대 ondemand에 비해 75%정도 저렴
- 전용 호스트 : 실제 서버 임대 (비싸서 대기업이 사용)

## EC2의 타입 종류
t2 m5 등~(범용)
p3 그래픽최적화(머신러닝,비트코인)

## EC2로 웹서버 만들기
접속 및 웹서버 설치 및 구동