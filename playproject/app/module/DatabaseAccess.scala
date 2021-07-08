package module

import java.sql.Connection
import java.sql.DriverManager

//noinspection SqlDialectInspection
object DatabaseAccess extends App{



  def userResult():List[Array[String]] = {

    val url = "jdbc:mysql://localhost/group_37"
    // val driver = "com.mysql.jdbc.Driver"
    val username = "root"
    val password = ""
    var connection:Connection =null
    var htmlValues:List[Array[String]] = List.empty



    try{
      // Class.forName(driver)
      connection = DriverManager.getConnection(url, username, password)
      val statement = connection.createStatement
      val searchResult = statement.executeQuery("SELECT * FROM `members` ")
      while(searchResult.next){
        val idNumber = searchResult.getString("id")
        val regNumber = searchResult.getString("indexNo")
        val firstName = searchResult.getString("firstName")
        val lastName = searchResult.getString("lastName")

        var subValues: Array[String] = Array(idNumber ,regNumber , firstName , lastName)
        //println(subValues)
        htmlValues :+= subValues
        //println(idNumber + " " + firstName + " " + lastName + " " + regNumber)

      }
    }
    catch{
      case e: Exception => e.printStackTrace()
    }

    //connection.close()
    //println(htmlValues)
    htmlValues
  }
  userResult()

}


