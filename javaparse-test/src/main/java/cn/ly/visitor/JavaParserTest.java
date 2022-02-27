package cn.ly.visitor;

import com.github.javaparser.JavaParser;
import com.github.javaparser.ast.CompilationUnit;

import java.io.File;

public class JavaParserTest {

    public void test(){
        File file = new File("D:\\keda\\back\\dispatch-avcs-meeting-new-backend\\dispatch-meeting-web\\src\\main\\java\\com\\kedacom\\dispatch\\meeting\\controller\\DispatchMeetingController.java");
        try {
            CompilationUnit compilationUnit = new JavaParser().parse(file).getResult().get();
//            compilationUnit.accept();
        }catch (Exception e){
            System.out.println("异常信息"+ e);
        }

    }

}
