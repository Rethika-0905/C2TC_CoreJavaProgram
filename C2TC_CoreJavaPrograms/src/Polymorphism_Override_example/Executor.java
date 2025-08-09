package Polymorphism_Override_example;

public class Executor {

	public static void main(String[] args) {
		
		//late binding, runtime, dynamic
		PLTraining plt = new PLTraining();
		plt.session("Full Stack Developer");
		
		plt = new JFS();
		plt.session("Method overriding");
		
		plt = new Python();
		plt.session("Django");

	}

}
