package ExerciciosAbstractClass;

@interface Informacoes {

	String autor();
	
	int infNum();
	
	String site() default "https://github.com/Leo3965";
}
