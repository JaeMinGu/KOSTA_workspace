class ReturnExample {
	public static void main(String[] args)	{
		System.out.println("���α׷� ���۵�");

		int i;
		for(i = 0; i <= 100 ; i++){ 
			System.out.println(i + " " + "KOSTA 187�� ȭ����!");
			if(i == 50){
				return; 
			}

		}//for

		
		System.out.println("���α׷� �����");
	}//main
}//class