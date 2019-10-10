import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wx906.entity.PlayersModel;
import com.wx906.service.PlayersService;

@Controller
@RequestMapping("players")   //自定义的名字
public class PlayersController {

	@Resource(name="playersService")
	private PlayersService playersService;
	
	@RequestMapping("/test.do")
	public ModelAndView test() {
		ModelAndView modelandview = new ModelAndView();
		List<PlayersModel> list = playersService.queryAll();
		
		System.out.println(list);
		modelandview.addObject(list);
		return modelandview;
	}
}
