package code.microsystem.services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import code.microsystem.dao.DAOConnection;
import code.microsystem.model.Car;

public class CarService {
	private Connection connection = null;
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	private int resutl;
	 
	public int addNewCar(Car car) throws SQLException {
		try {
			String addQuery ="insert int cartb(CarName,Price,Varient,SteeringType,FuelType,DealerName,ManufacturingYear)values(?,?,?,?,?,?,?)";
			connection = DAOConnection.getConnection();
			pst.setString(1, car.getCarName());
			pst.setString(2, car.getPrice());
			pst.setString(3, car.getVarient());
			pst.setString(4, car.getSteeringType());
			pst.setString(5, car.getFuelType());
			pst.setString(6, car.getDealerName());
			pst.setString(7, car.getManufacturingYear());
			
			int result = pst.executeUpdate();
			return resutl;
			} catch (Exception e) {
			e.printStackTrace();
		   }finally {
			   connection.close();
		   }
		return 0;
		
	}
	
	public List<Car> getAllCars() throws SQLException{
		String queryGet = "select * from cartb";
		List<Car> list = new ArrayList<Car>(); 
		try {
			connection = DAOConnection.getConnection();
			pst = connection.prepareStatement(queryGet);
			rs = pst.executeQuery();
			while(rs.next()) {
				Car card = new Car();
				card.setId(rs.getInt("Id"));
				card.setCarName(rs.getString("CarName"));
				card.setPrice(rs.getString("Price"));
				card.setVarient(rs.getString("Varient"));
				card.setSteeringType(rs.getString("SteeringType"));
				card.setFuelType(rs.getString("FuelType"));
				card.setDealerName(rs.getString("DealerName"));
				card.setManufacturingYear(rs.getString("ManufacturingYear"));
				
				list.add(card);
			}
			return list;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			connection.close();
		}
		return null;
		
	}
	
}
