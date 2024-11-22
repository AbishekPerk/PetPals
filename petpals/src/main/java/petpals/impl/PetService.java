package petpals.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import petpals.dao.PetDao;
import petpals.entity.Pet;
import petpals.util.DBConnectUtil;

public class PetService implements PetDao{

	@Override
	public String addPet(Pet pet) {
		// TODO Auto-generated method stub
		Connection con = DBConnectUtil.getConnection();
		PreparedStatement pstmt=null;
		String rs;
	    
		try {
			pstmt=con.prepareStatement("INSERT INTO pets (name, age, breed, type, dog_breed, cat_color) VALUES (?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, pet.getName());
			pstmt.setInt(2, pet.getAge());
			pstmt.setString(3, pet.getBreed());
			pstmt.setString(4, pet.getBreed());
			pstmt.setString(5, pet.getDogBreed());
			pstmt.setString(6, pet.getCatColor());
			pstmt.executeUpdate();

            rs = "Data successfully added to database";
		}catch(SQLException ex) {
			ex.printStackTrace();
			rs="Error while inserting Pet details.....";
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error occurred while closing connection");
			}
		}
		return rs;
	}

	@Override
	public Pet getPetById(int petId) {
		// TODO Auto-generated method stub
		Connection con = DBConnectUtil.getConnection();
		PreparedStatement pstmt=null;
		Pet pt = null;
		try {
			pstmt=con.prepareStatement("select * from pets where pet_id=?");
			pstmt.setInt(1, petId);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				pt = new Pet(rs.getString("name"),rs.getInt("age"),rs.getString("breed"),rs.getString("dog_breed"),rs.getString("cat_color"));
			}else {
				System.out.println("No data available");
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error while finding pet details");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error occurred while closing connection");
			}
		}
		return pt;
		
	}

	@Override
	public List<Pet> getAllPets() {
		// TODO Auto-generated method stub
		Connection con = DBConnectUtil.getConnection();
		PreparedStatement pstmt=null;
		Pet pt = null;
		
		try {
			pstmt=con.prepareStatement("select * from pets where");
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
				pt = new Pet(rs.getString("name"),rs.getInt("age"),rs.getString("breed"),rs.getString("dog_breed"),rs.getString("cat_color"));
			}else {
				System.out.println("No data available");
			}
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Error while finding pet details");
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Error occurred while closing connection");
			}
		}
		//return pt;
		return null;
	}

	@Override
	public List<Pet> getPetsByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePet(Pet pet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removePetById(int petId) {
		// TODO Auto-generated method stub
		
	}
      
}
