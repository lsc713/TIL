> cpu사용을위해 프로세스에 대한 우선순위가 pcb에 존재하 스케쥴링큐를통해 프로세스를관리한다.


>cpu사용을 위한 준비큐와 io장치사용을 위한 대기큐가 존재

>선점형 비선점형 스케쥴링 : 사용중인자원을 뺏을 수 있는가 없는가에 따라 달라짐. 뻇을 수 이씅면 선점형스케쥴링.

# 스케쥴링 알고리즘은
1. 선입선출형
2. 최단작업 우선
3. 라운드로빈(선입선출+정해진 시간만큼만 cpu사용 가능)
4. 최소잔여시간 우선
5. 우선순위스케쥴링 -> 우선순위낮으면 기아발생우려 >>> 에이징을 통한 우선순위를 높여줌
6. 다단계스케쥴링(여러개의 우선순위큐를 사용)- 큐마다 타임슬라이스를 다르게 구성가능.
7. 다단계피드백큐 - 다단계스케쥴링 + 실행이 끝나지 않은 프로세스는 큐에 산입될때 우선순위가 밀림.->기아에 대한 대처로 에이징가능

