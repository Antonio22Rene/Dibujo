package edu.cetec.appdibujo.proyecto;

public class principal {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
			
		//usuario
		usuario usr1 = new usuario(null, 0);
		usr1.registrarse();
		
		//estilo dibujo
		estiloDibujo estilo = new estiloDibujo(null, 0, null, null, null, null, null);
		estilo.seleccionEstilo();
		//herencia estilo
		estilo.getNombreUsuario();
			
		//dispositivo
		dispositivo dis = new dispositivo();
		dis.seleccionDispositivo();
		//herencia dispositivo
		dis.getInicio();
		dis.regresarCurso();
		
		//guia
		guia g1 = new guia();
		g1.guiaAyuda();
		//herencia guia
		g1.getInicio();
		g1.regresarCurso();
		
		//lapiz
		lapiz Lapiz = new lapiz();
		Lapiz.seleccionLapiz();
		
		//horario
		horario hora = new horario();
		hora.seleccionHorario();
		
		
		//tipo curso
		curso tipo = new curso(null, 0, null, null);
		tipo.clases();
		
		//camara
		camara cam = new camara();
		cam.apagarCamara();
		cam.encenderCamara();
		//herencia camara
		cam.getCelular();
		cam.getLaptop();
		cam.getTablet();
		
		//menu
		menu m1 = new menu();
		m1.salirCurso();
		m1.regresarCurso();
		m1.salirApp();
		
		//locacion
		locacion lo = new locacion(null, 0, null, null, null);
		lo.buscarEstado();
		lo.buscarPais();
		lo.seleccionIdioma();
		//herencia de usuario
		lo.getNombreUsuario();
		
		
		//curso
		cursoOnline co = new cursoOnline();
		co.comenzarCurso();
		cursoGrabado gra = new cursoGrabado();
		gra.comenzarVideo();
		//herencia curso
		co.setNombreAlumno("Antonio");
		
		//tutor
		tutor tu = new tutor(null, null, 0, null, null, null, 0);
		tu.comenzarClase();
		//herencia tutor
		tu.getNombreUsuario();
		
	
		//usuario
	System.out.println("hola bienvenido a nuestra app");
	System.out.println("debes registrarte");
	usr1.setNombreUsuario("Antonio");
	System.out.println("Usuario :" + usr1.getNombreUsuario());
	
	usr1.setContraseña(221999);
	System.out.println("Contraseña :"+ usr1.getContraseña());
	
	System.out.println("Bienvenido :"+ usr1.getNombreUsuario());
	
	//estiloDibujo
	System.out.println();
	System.out.println("selecciona tu estilo favorito " );
	estilo.setCaricatura("caricatura");
	System.out.println("escoge el estilo :"+ estilo.getCaricatura());
	
	estilo.setComic("comic");
	System.out.println("escoge el estilo :"+ estilo.getComic());
	
	estilo.setHiperrealismo("hiperrealismo");
	System.out.println("escoge el estilo :"+ estilo.getHiperrealismo());
	
	estilo.setManga("manga");
	System.out.println("escoge el estilo :"+ estilo.getManga());
	
	estilo.setRealismo("realismo");
	System.out.println("escoge el estilo :"+ estilo.getRealismo());
	
	System.out.println("muy bien: " + usr1.getNombreUsuario() + " has escogido el estilo: " + estilo.getRealismo());
	
	//dispositivo
	System.out.println();
	System.out.println("selecciona tu dispositivo favorito: " );
	dis.setCelular(" un celular");
	System.out.println("tu dispositivo es un: "+ dis.getCelular());
	
	dis.setComputadora("una computadora");
	System.out.println("tu dispositivo es: "+ dis.getComputadora());
	
	dis.setLaptop("una laptop");
	System.out.println("tu dispositivo es :"+ dis.getLaptop());
	
	dis.setTablet("una tablet");
	System.out.println("tu dispositivo es un: " + dis.getTablet());
	
	System.out.println("muy bien: " + usr1.getNombreUsuario()+ " tu dispositivo es:" + dis.getCelular());
	
	//guia.
	System.out.println();
	System.out.println("esta es tu guia de ayuda:" );
	g1.setRespuestas("gracias por preguntar");
	System.out.println("esperamos haberte ayudado: "+ g1.getRespuestas());
	
	//lapiz
	System.out.println();
	Lapiz.setGraduacionLapiz("seis B");
	System.out.println("necesitaras con que trabajar: " + usr1.getNombreUsuario());
	
	Lapiz.setNumLapiz(1);
	System.out.println("necesitaras: "+ Lapiz.getNumLapiz()+" lapicez");
	
	Lapiz.setMarcaLapiz("prisma color");
	System.out.println("de cualquier marca: " + Lapiz.getMarcaLapiz());
	
	//Horario
	System.out.println();
	System.out.println("selecciona tu horario:");
	hora.setMatutino("matutino");
	System.out.println("tu horario es: "+ hora.getMatutino());
	
	hora.setVespertino("vespertino");
	System.out.println("tu horario es: "+ hora.getVespertino());
	System.out.println("muy bien: "+ usr1.getNombreUsuario() + " tu horario es: "+ hora.getVespertino());

	//curso
	System.out.println();
	tipo.setGrabado("videos");
	System.out.println("elegiste el tipo de curso: "+ tipo.getGrabado());
	
	tipo.setOnline("online");
	System.out.println("elegiste el tipo de curso: "+ tipo.getOnline());
	
	System.out.println("muy bien: "+ usr1.getNombreUsuario() + " tu curso es: "+ tipo.getGrabado());
	
	//camara
	System.out.println();
	System.out.println("si deseas activar tu camara eligue una de las siguientes opciones");
	cam.setCalidad(1080);
	System.out.println("tienes calidad: "+ cam.getCalidad());
	
	cam.setFrontal("frontal activada");
	System.out.println("tu camara: "+ cam.getFrontal());
	
	cam.setTrasera("trasera activada");
	System.out.println("tu camara: "+ cam.getTrasera());
	
	System.out.println("muy bien: "+ usr1.getNombreUsuario() +" tu camara: "+ cam.getFrontal());
	
	//menu
	System.out.println();
	System.out.println("Bienvenido a tu menu "+ usr1.getNombreUsuario());
	
	m1.setInicio("inicio");
	System.out.println("Bienvenido al inicio: "+ usr1.getNombreUsuario());
	
	m1.salirCurso();
	System.out.println("deseas salir del curso ? "+ usr1.getNombreUsuario());
	
	m1.regresarCurso();
	System.out.println("deseas regresar al curso ? "+ usr1.getNombreUsuario());
	
	m1.salirApp();
	System.out.println("no vemos: "+ usr1.getNombreUsuario());
	
	//locacion
	System.out.println();
	System.out.println("escoge tu lugar de residencia para poder brindarte un tutor");
	lo.setEstado("morelos");
	System.out.println("tu estado es: "+ lo.getEstado());
	
	lo.setPais("mexico");
	System.out.println("tu pais es: "+ lo.getPais());
	
	lo.setIdioma("español");
	System.out.println("tu idioma es: "+ lo.getIdioma());
	
	System.out.println("muy bien: "+ usr1.getNombreUsuario()+" tu estado es: "+ lo.getEstado() +" y tu pais: "+ lo.getPais()+" asi que tu hablas: "+ lo.getIdioma());
	
	
	
	//tutor
	
	System.out.println();
	tu.setNombre("juan");
	System.out.println("profesor: "+ tu.getNombre());
	
	tu.setApellidos("hernandez jaimes");
	System.out.println("apellidos: "+ tu.getApellidos());
	
	tu.setEdad(20);
	System.out.println("su edad es: "+ tu.getEdad());
	
	tu.setEstiloDibujo("realismo");
	System.out.println("su especialidad es: "+ tu.getEstiloDibujo());
	
	
	//cursoOnline
	System.out.println();
	System.out.println("Estamos terminando la configuracion: "+ usr1.getNombreUsuario());
	System.out.println("seleccionaste un curso online");

	co.setEstiloDibujo(estilo.getRealismo());
	System.out.println("tu estilo es: "+ co.getEstiloDibujo());
	
	co.setHorario(hora.getVespertino());
	System.out.println("tu horario es: "+ co.getHorario());
	
	co.setNombreAlumno(usr1.getNombreUsuario());
	System.out.println("muy bien: "+ co.getNombreAlumno());
	
	co.setTutor("juan");
	System.out.println("tu profesor es: "+ co.getTutor());
	
	//cursograbado
	System.out.println();
	System.out.println("seleccionaste curso pre-grabado");
	
	gra.setEstiloDibujo("realismo");
	System.out.println("tu estilo es:"+ gra.getEstiloDibujo());
	
	gra.setNombreAlumno(usr1.getNombreUsuario());
	System.out.println("muy bien :"+ gra.getNombreAlumno());
	
	gra.setTutor("juan");
	System.out.println("tu profesor es:"+ gra.getTutor());
	
	System.out.println();
	System.out.println("Todo listo para empezar tu curso" + usr1.getNombreUsuario() + "Bienvenido");
	

	
	
	
	}
}
