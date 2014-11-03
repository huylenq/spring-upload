package upload;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileUploadController {
    
    @RequestMapping(value="/uploadFile", method=RequestMethod.POST)
    public @ResponseBody String uploadFile(@RequestParam("file") MultipartFile fileUploaded, 
                                           @RequestParam("name") String fileName) {
        System.out.println(fileName);
        return "File uploaded";
    }
}