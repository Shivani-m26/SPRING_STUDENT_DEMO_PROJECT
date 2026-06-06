package org.example.jdbc;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "index";
    }
//    @RequestMapping("/submitForm")
//    public String detectadhd(HttpServletRequest req, HttpSession session){
//
//        String name=req.getParameter("name");
//        int age=Integer.parseInt(req.getParameter("age"));
//        int focus_level=Integer.parseInt(req.getParameter("focus"));
//        boolean distraction=Boolean.parseBoolean(req.getParameter("distraction"));
//        int accuracy=Integer.parseInt(req.getParameter("accuracy"));
//        String result="";
//        if(focus_level>8 && accuracy>70){
//            result="normal";
//
//        }
//        else if(focus_level<8 && accuracy>70){
//            result="adhd may exist ";
//
//        }
//        else if(focus_level<8 && accuracy<70){
//            result="adhd definitely exist ";
//
//        }
//        else if(focus_level<5 && accuracy<50){
//            result="severe adhd";
//
//        }
//        else{
//            result="cannot determine";
//
//        }
//
//        session.setAttribute("result",result);
//        return "index.jsp";
//
//
//    }
//}
@RequestMapping("/submitForm")
public ModelAndView detectadhd(@RequestParam("name") String name,
                         @RequestParam("age") int age,
                         @RequestParam("focus_level") int focus_level,
                         @RequestParam("distraction") String distraction,
                         @RequestParam("accuracy") int accuracy,ModelAndView mv
                         ){





    String result="";
    if(focus_level>8 && accuracy>70){
        result="normal";
    }
    else if(focus_level<5 && accuracy<50){
        result="severe adhd";
    }
    else if(focus_level<8 && accuracy<70){
        result="adhd definitely exist";
    }
    else if(focus_level<8 && accuracy>70){
        result="adhd may exist";
    }
    else{
        result="cannot determine";
    }

    mv.addObject("result",result);
    mv.setViewName("result");

    return mv;


}
}
