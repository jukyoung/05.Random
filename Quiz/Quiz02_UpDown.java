import java.util.Scanner;

public class Quiz02_UpDown {
	public static void main(String[] args) {

		// Up&Down
		// 1~99 ���� ������ ���ڸ� �����ϰ� �Է��ϸ� ������ ����, Ʋ���� up���� down���� �˷��ְ� ���Է�
		// 1�� �޴��� ���� 2�� �޴��� ����(��:1�� 0��) 3�� �޴��� ���� ���� (7���ȿ� ���߸� �� �ƴϸ� ��)

		Scanner sc = new Scanner(System.in);

		int win = 0;
		int lose = 0;
		game: while (true) {
			System.out.println("\n ==== Up & Down ���� ====");
			System.out.println("1. ���� ����");
			System.out.println("2. ���� ���ھ�");
			System.out.println("3. ���� ����");
			System.out.print(">> ");
			int menu = Integer.parseInt(sc.nextLine());

			int ranNum = (int) (Math.random() * (99 - 1 + 1) + 1);

			if (menu == 1) {
				for (int i = 1; i < 8; i++) {
					System.out.print("\n���ڸ� �Է��ϼ��� >> ");
					int input = Integer.parseInt(sc.nextLine());
					if (input > ranNum) {
						System.out.println("<<Down>>");
					} else if (input < ranNum) {
						System.out.println("<<Up>>");
					} else if (input == ranNum) {
						System.out.println("\n�����Դϴ�!");
						win += 1;
						System.out.println("���ھ� : " + win + "win" + lose + "lose");
						continue game;
					}
				}
				System.out.println("\n�����ϴ�. ���ڴ� " + ranNum + "�̿����ϴ�.");
				lose += 1;
				System.out.println("���ھ� : " + win + "win " + lose + "lose");
				continue;
			} else if (menu == 2) {
				System.out.println("\n���� ���ھ�� " + win + "win " + lose + "lose" + " �Դϴ�.");
				continue;
			} else if (menu == 3) {
				System.out.println("\n*** ������ �����մϴ� ***");
				break;
			} else {
				System.out.println("\n��ȣ�� �߸� �Է��ϼ̽��ϴ�. �ٽ� �������ּ���.");
				continue;
			}
		}
	}
}
