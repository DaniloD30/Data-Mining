/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mining;

import weka.associations.Apriori;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

/**
 *
 * @author LEESE
 */
public class Associacao {
    public static void main(String[] args) throws Exception {
        DataSource ds = new DataSource("src\\Mining\\supermarket1.arff");
        Instances in = ds.getDataSet();
        //System.out.println(in.toString());
        
        Apriori ap = new Apriori();
        ap.buildAssociations(in);
        System.out.println(ap);
        
        // se eu nao compro pao então eu n compro leite
        //se eu n compro cafe e eu nao compro cerveja entao eu tambem n compro leite
        // conf = confiança
        // suporte é a frequencia dos itens na base de dados
        // confiança minMetric
    }
}
