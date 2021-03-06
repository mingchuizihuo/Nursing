package generate;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class GenerateController {

    /**
     *
      * @param ftlPath
     * @param ftlName
     * @param fileName2
     * @param filePath
     * @param packageName
     * @param modelpackageName
     * @param servicepackageName
     * @throws IOException
     * @throws TemplateException
     */
    public static void Generate(String ftlPath,
                                String ftlName,
                                String fileName2,
                                String filePath,
                                String packageName,
                                String modelpackageName,
                                String servicepackageName

    ) throws IOException, TemplateException {
        PathUtil.Path_Judge_Exist(ftlPath);
        PathUtil.Path_Judge_Exist(filePath);
        String fileName = fileName2.split(",")[0];
        //实体类需要其他参数
        Map<String, Object> root = new HashMap<String, Object>();

        root.put("modelpackageName", modelpackageName);
        root.put("ImplpackageName", servicepackageName + "." + fileName + "Service");
        root.put("packageName", packageName);
        root.put("className", fileName);
        if(fileName2.split(",").length>2){
            root.put("level",true);
        }else{
            root.put("level",false);
        }



        root.put("urlName", camelToUnderline(fileName));
        root.put("chinaName", fileName2.split(",")[1]);
        Configuration cfg = new Configuration();
        String path = System.getProperty("user.dir") + ftlPath;

        cfg.setDirectoryForTemplateLoading(new File(path));
        Template template = cfg.getTemplate(ftlName);

        PathUtil.printFile(root, template, filePath, fileName+"Controller");
    }
    public static final char UNDERLINE='_';
    public static String camelToUnderline(String param){
        if (param==null||"".equals(param.trim())){
            return "";
        }
        int len=param.length();
        StringBuilder sb=new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c=param.charAt(i);
            if(i==0){
                sb.append(c);
            }else{
                if (Character.isUpperCase(c)){

                    sb.append(UNDERLINE);
                    sb.append(Character.toLowerCase(c));
                }else{
                    sb.append(c);
                }
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String[] fileNames = new String[]{
            "InspectionItemInspectionResult,检查健康状况项目结果表",




        };
        for (String fileName:fileNames) {


            try {
                GenerateController.Generate(
                        "\\Inspection\\src\\test\\java\\ftl",
                        "controller.ftl",
                        fileName,
                        "\\Inspection\\src\\main\\java\\com\\idea\\nursing\\inspection\\web\\controller",

                        "com.idea.nursing.inspection.web.controller",
                        "com.idea.nursing.inspection.web.domain.pojo",
                        "com.idea.nursing.inspection.web.service"

                );
            } catch (IOException e) {
                e.printStackTrace();
            } catch (TemplateException e) {
                e.printStackTrace();
            }
        }

    }
}