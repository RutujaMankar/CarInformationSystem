package code.microsystem.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import code.microsystem.model.Car;

/**
 * Servlet implementation class CarController
 */
@WebServlet("/CarController")
public class CarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String action = request.getParameter("action");
		switch(action) {
		case "add":
			try {
				addNewCar(request,response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private void addNewCar(HttpServletRequest request, HttpServletResponse response) {
		Car car=new Car();
		String carName=request.getParameter("CarName");
		car.setCarName(carName);
		car.setPrice(request.getParameter("Price"));
		car.setVarient(request.getParameter("Varient"));
		car.setSteeringType(request.getParameter("SteeringType"));
		car.setFuelType(request.getParameter("FuelType"));
		car.setDealerName(request.getParameter("DealerName"));
		car.setManufacturingYear(request.getParameter("ManufacturingYear"));
		int result = carservice.addNewCar(car);
		if(result==1) {
			request.setAttribute("msg", "Car Added Successflully");
		    request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		else {
			request.setAttribute("msg", "Error in inserting of new Car");
			request.getRequestDispatcher("home.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
