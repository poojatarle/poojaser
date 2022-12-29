package dsapp.servlet;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

import dsapp.MenuStore;
import dsapp.menu.Menu;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MenuServlet extends HttpServlet {
	
	private ObjectMapper mapper = new ObjectMapper();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getPathInfo();
		if(path != null && !path.isEmpty()) {
			path = path.substring(1);
		}
		
		switch(path) {
			case "display":
				String menuName = req.getParameter("name");
				switch(menuName) {
				case "stack":
					Menu stackMenu = MenuStore.INSTANCE.getStackMenu();
					String stackJson = mapper.writeValueAsString(stackMenu);
					resp.getWriter().append(stackJson).flush();
					break;
				case "queue":
					break;
				case "array":
					break;
				case "linkedlist":
					break;
				case "main":
				default:
					Menu mainMenu = MenuStore.INSTANCE.getMainMenu();
					String mainJson = mapper.writeValueAsString(mainMenu);
					resp.getWriter().append(mainJson).flush();
					break;
					
				}
				break;
			default:
				resp.getWriter().append("Operation not supported").flush();
				break;
			
		}
		
	
		
	}

}
