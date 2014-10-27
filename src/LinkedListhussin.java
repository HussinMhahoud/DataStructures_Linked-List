public class LinkedListhussin {

	private ListNode head = null;

	public void print() {
		ListNode i = this.head;
		while (i != null) {
			System.out.print(i.value);
			i = i.next;

		}

	}

	public void add(char v, int indx) {
		if (indx < 0) {
			System.out.println("add err");
			return;
		}

		ListNode newNode = new ListNode();
		newNode.value = v;
		if (indx == 0) {
			newNode.next = head;
			head = newNode;

		} else {
			ListNode i = head;
			if (i == null) {
				System.out.println("add err #1#");
				return;
			}
			for (int j = 0; j < indx - 1; j++) {

				if (i == null) {
					System.out.println("add err");
					return;
				}

				i = i.next;
			}

			newNode.next = i.next;
			i.next = newNode;

		}

	}

	public void remov(int indx) {
		if (indx < 0) {
			System.out.println("remov err");
			return;
		}

		if (indx == 0) {

			head = head.next;

		} else {
			ListNode i = head;
			if (i == null) {
				System.out.println("remov err #1#");
				return;
			}
			for (int z = 0; z < indx - 1; z++) {

				if (i == null) {
					System.out.println("remov err");
					return;
				}

				i = i.next;
			}

			ListNode j = i.next;
			i.next = j.next;

		}

	}

}
