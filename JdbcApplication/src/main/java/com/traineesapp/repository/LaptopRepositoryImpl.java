package com.traineesapp.repository;

import com.traineesapp.exception.RecordNotFoundException;
import com.traineesapp.model.Laptop;
import com.traineesapp.util.JdbcConnectionUtil;

import javax.sql.rowset.RowSetWarning;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class LaptopRepositoryImpl implements LaptopRepository{

    @Override
    public Laptop saveLaptop(Laptop laptop) throws RecordNotFoundException {
        try {
            Connection connection = JdbcConnectionUtil.getConnection();
            String query = "insert into laptops (laptop_name,price,brand)values(?,?,?)";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, laptop.getLaptopName());
            statement.setDouble(2, laptop.getPrice());
            statement.setString(3, laptop.getBrand());
            int result = statement.executeUpdate();
            if (result == 0)
                throw new RuntimeException("Failed to save");
            JdbcConnectionUtil.closeConnection();
            return laptop;
        }catch (SQLException  | RecordNotFoundException ex){
            System.out.println(ex.getMessage());
        }

    public Optional<Laptop> getLaptopById(int id) throws RecordNotFoundException {
            try {
                Connection conn = JdbcConnectionUtil.getConnection();
                String query = "select * from Laptops where id = ?";
                PreparedStatement statement = conn.prepareStatement(query);
                statement.setInt(1, id);
                ResultSet resultSet = statement.executeQuery();
                Optional<Laptop> laptop1;
            } catch (SQLException | RecordNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

        private Optional<Laptop> getLaptopsFromResultSet(ResultSet resultSet) throws SQLException{
                if(resultSet.next()){
                    Laptop laptop = processLaptopResult(resultSet);
                    return Optional.of(laptop);
                }
                return Optional.empty();
        }
        private Laptop processLaptopResult(ResultSet resultSet) throws SQLException{
            Laptop laptop = new Laptop();
            laptop.setLaptopName(resultSet.getString(1));
            laptop.setPrice(resultSet.getDouble(2));
            laptop.setBrand(resultSet.getString(3));

            return laptop;
        }


    @Override
    public Optional<Laptop> getLaptopByName(String traineeName) throws RecordNotFoundException {
        return Optional.empty();
    }

    @Override
    public List<Laptop> getAllTrainees() {
        return null;
    }

    @Override
    public void deleteTrainee(int id) throws RecordNotFoundException {

    }

    @Override
    public Laptop updateTrainee(int id, Laptop newTrainee) throws RecordNotFoundException {
        return null;
    }
}
