# 교착상태 발생조건
1. 상호배제 - 하나의 자원에 하나의 프로세스만 이용가능
2. 점유와 대기 - 자원을 할당받고 다른자원할당을 기다림
3. 비선점 - 다른 프로세스의 자원을 뺏을 수 없음
4. 원형대기

![세피로트](https://mblogthumb-phinf.pstatic.net/MjAyMDA3MDFfMjU0/MDAxNTkzNTkxODQ4NTAz.ed7sszaC38N9sbRCf3MBhFpNKR3sVqdaDTot-TMwOawg.OCAOmiTC8ZrINMsrW0w4Fy_DLgN1uMz2TcFljSLD8hsg.JPEG.smc503/%EB%8B%A4%EC%9A%B4%EB%A1%9C%EB%93%9C.jpg?type=w800)

===
# 교착상태를 없애려면
1. 예방 - 쉽지 않다 (원형대기 방지를 위해 자원 번호를 붙인다면? 하지만 실제로 모든자원에 번호붙이기는 어렵다)
2. 회피 - 안전순서열의 적용 (안전하게 프로세스가 자원을 할당받을 수 있는 순서)
3. 검출 및 회복 - 사후조치에 해당.
>(1) 선점을 통한 회복 - 교착상태가 회복될때 까지 한 프로세스씩 자원을 몰아받는다.

>(2) 프로세스 강제종료 

> cf.타조알고리즘도 있다고함(ㅋㅋ땅에 머리박고 무시한다고)
