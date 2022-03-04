import java.util.Scanner;

public class Quiz02_UpDown {
	public static void main(String[] args) {

		// Up&Down
		// 1~99 까지 랜덤한 숫자를 추측하겨 입려하면 맞으면 정답, 틀리면 up인지 down인지 알려주고 재입력
		// 1번 메뉴는 게임 2번 메뉴는 점수(예:1승 0패) 3번 메뉴는 게임 종료 (7번안에 맞추면 승 아니면 패)

		Scanner sc = new Scanner(System.in);

		int win = 0;
		int lose = 0;
		game: while (true) {
			System.out.println("\n ==== Up & Down 게임 ====");
			System.out.println("1. 게임 시작");
			System.out.println("2. 게임 스코어");
			System.out.println("3. 게임 종료");
			System.out.print(">> ");
			int menu = Integer.parseInt(sc.nextLine());

			int ranNum = (int) (Math.random() * (99 - 1 + 1) + 1);

			if (menu == 1) {
				for (int i = 1; i < 8; i++) {
					System.out.print("\n숫자를 입력하세요 >> ");
					int input = Integer.parseInt(sc.nextLine());
					if (input > ranNum) {
						System.out.println("<<Down>>");
					} else if (input < ranNum) {
						System.out.println("<<Up>>");
					} else if (input == ranNum) {
						System.out.println("\n정답입니다!");
						win += 1;
						System.out.println("스코어 : " + win + "win" + lose + "lose");
						continue game;
					}
				}
				System.out.println("\n졌습니다. 숫자는 " + ranNum + "이였습니다.");
				lose += 1;
				System.out.println("스코어 : " + win + "win " + lose + "lose");
				continue;
			} else if (menu == 2) {
				System.out.println("\n현재 스코어는 " + win + "win " + lose + "lose" + " 입니다.");
				continue;
			} else if (menu == 3) {
				System.out.println("\n*** 게임을 종료합니다 ***");
				break;
			} else {
				System.out.println("\n번호를 잘못 입력하셨습니다. 다시 선택해주세요.");
				continue;
			}
		}
	}
}
