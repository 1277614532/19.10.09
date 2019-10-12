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

