import javax.swing.JOptionPane;
/** 
 * 
 * @author haa2224
 * Author: Hamza Abshir
 * 
 */
public class ForLoop {

	public static void main(String[] args) {
        String UserName, Password;
		
		UserName = JOptionPane.showInputDialog("Enter Username :");
		Password = JOptionPane.showInputDialog("Enter Password :");
		
		for (int i = 0; i < 3; i++ ){
			if(UserName .equals("hamza") || Password.equals("wutang21")){
				JOptionPane.showMessageDialog(null, "Welcome " + UserName);
				
				i +=3;
			}
			
			else {
				UserName = JOptionPane.showInputDialog("Enter Username :");
				Password = JOptionPane.showInputDialog("Enter Password :");
				
				i = i +3;
				
			}
		
		
		if (!UserName .equals("hamza==hhh") || !Password .equals("wutang21===ggg")) {
		JOptionPane.showMessageDialog(null, "Please contact your administrator to unlock your account!");
		
		
		}}	}}
	