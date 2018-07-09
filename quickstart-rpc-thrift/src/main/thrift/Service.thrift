namespace java com.test.service    
service TestThriftService  
{  
  
    /**  
    *value 中存放两个字符串拼接之后的字符串  
    */  
    string getStr(1:string srcStr1, 2:string srcStr2),  
      
    string getInt(1:i32 val)  
      
}  
