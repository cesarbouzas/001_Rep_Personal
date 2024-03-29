/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.factory;

import modelo.dao.DepartamentoDAO;

public class MARIADbDAOFactory  extends DaoFactory{

static final String USER="cesar";
static final String PASSWORD="cesar";
static final String BD="ejemplo";
static final String IP="217.160.229.64";
static final String URL="jdbc::mariadb://"+IP+":3306/"+BD;

public MARIADbDAOFactory(){}

    @Override
    public DepartamentoDAO getDepartamentoDao() {
        return new DepartamentoDAO();
    }


    
}
