package tw.luchienlin.java.classes;

// public 不受限制的修飾字
// private 沒有其他可以使用該class
// protected 這個package可以使用
public class Car {

	// field
	private int doors;
	private int wheels;
	private String modal;
	private String engine;
	private String color;
	
	
	// 裡面的String modal跟上面的不一樣
	public void setModal(String modal) {
		// 如果要將值傳同名的到上面就要用this
		String validModal = modal.toLowerCase();
		// String.equals是去判斷String的值
		if(validModal.equals("Carrera") || validModal.contentEquals("holden")) {
			this.modal = modal;
		} else {
			this.modal = "Unkown";
		}
		
	}
	
	public String getModal() {
		return this.modal;
	}
}
