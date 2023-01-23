package Scheduler;

public class PrioritAllocation implements Scheduler {
	//고객등급이 높은 고객의 전화부터 대기열에서 가져와 업무능력이 노은 상담원 우선배분
	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("고객등급이 높은 고객의 전화를 먼저 가져옵니다. ");
	}

	@Override
	public void sendCallToagent() {
		// TODO Auto-generated method stub
		System.out.println("업무skill값이 높은 상담원에게 우선적으로 배분합니다. ");
	}

}
