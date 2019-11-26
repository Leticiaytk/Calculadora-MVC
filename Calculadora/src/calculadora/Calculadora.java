package calculadora;

public class Calculadora {
	public static void main(String[] args) {
		CalcModel model = new CalcModel();
		CalcView view = new CalcView(model);
		CalController controller = new CalController(model, view);
		view.setVisible(true);
	}
}

