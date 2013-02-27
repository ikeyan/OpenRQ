
public abstract class Rand {
		
	public static long rand(long y, int i, long m){
		
		if(y < 0)   throw new IllegalArgumentException("y must be non-negative.");
		if(i < 0 || i > 255) throw new IllegalArgumentException("i must be non-negative and less than 256.");
		if(m < 1)   throw new IllegalArgumentException("m must be positive.");
		
		int x0, x1, x2, x3;
		
		x0 = (int) ((y + i)                             % 256);
		x1 = (Encoder.floor((double) y /      256) + i) % 256;
		x2 = (Encoder.floor((double) y /    65536) + i) % 256;
		x3 = (Encoder.floor((double) y / 16777216) + i) % 256;
		
		long v0 = V0[x0];
		long v1 = V1[x1];
		long v2 = V2[x2];
		long v3 = V3[x3];
		
		long ret2 = v0 ^ v1 ^ v2 ^ v3;
		ret2 = ret2 % m;
		
		return ret2;
	}
	
	private static final long[] V0 = {
		251291136L, 3952231631L, 3370958628L, 4070167936L, 123631495L,
		3351110283L, 3218676425L, 2011642291L, 774603218L, 2402805061L,
		1004366930L, 1843948209L, 428891132L, 3746331984L, 1591258008L,
		3067016507L, 1433388735L, 504005498L, 2032657933L, 3419319784L,
		2805686246L, 3102436986L, 3808671154L, 2501582075L, 3978944421L,
		246043949L, 4016898363L, 649743608L, 1974987508L, 2651273766L,
		2357956801L, 689605112L, 715807172L, 2722736134L, 191939188L,
		3535520147L, 3277019569L, 1470435941L, 3763101702L, 3232409631L,
		122701163L, 3920852693L, 782246947L, 372121310L, 2995604341L,
		2045698575L, 2332962102L, 4005368743L, 218596347L, 3415381967L,
		4207612806L, 861117671L, 3676575285L, 2581671944L, 3312220480L,
		681232419L, 307306866L, 4112503940L, 1158111502L, 709227802L,
		2724140433L, 4201101115L, 4215970289L, 4048876515L, 3031661061L,
		1909085522L, 510985033L, 1361682810L, 129243379L, 3142379587L,
		2569842483L, 3033268270L, 1658118006L, 932109358L, 1982290045L,
		2983082771L, 3007670818L, 3448104768L, 683749698L, 778296777L,
		1399125101L, 1939403708L, 1692176003L, 3868299200L, 1422476658L,
		593093658L, 1878973865L, 2526292949L, 1591602827L, 3986158854L,
		3964389521L, 2695031039L, 1942050155L, 424618399L, 1347204291L,
		2669179716L, 2434425874L, 2540801947L, 1384069776L, 4123580443L,
		1523670218L, 2708475297L, 1046771089L, 2229796016L, 1255426612L,
		4213663089L, 1521339547L, 3041843489L, 420130494L, 10677091L,
		515623176L, 3457502702L, 2115821274L, 2720124766L, 3242576090L,
		854310108L, 425973987L, 325832382L, 1796851292L, 2462744411L,
		1976681690L, 1408671665L, 1228817808L, 3917210003L, 263976645L,
		2593736473L, 2471651269L, 4291353919L, 650792940L, 1191583883L,
		3046561335L, 2466530435L, 2545983082L, 969168436L, 2019348792L,
		2268075521L, 1169345068L, 3250240009L, 3963499681L, 2560755113L,
		911182396L, 760842409L, 3569308693L, 2687243553L, 381854665L,
		2613828404L, 2761078866L, 1456668111L, 883760091L, 3294951678L,
		1604598575L, 1985308198L, 1014570543L, 2724959607L, 3062518035L,
		3115293053L, 138853680L, 4160398285L, 3322241130L, 2068983570L,
		2247491078L, 3669524410L, 1575146607L, 828029864L, 3732001371L,
		3422026452L, 3370954177L, 4006626915L, 543812220L, 1243116171L,
		3928372514L, 2791443445L, 4081325272L, 2280435605L, 885616073L,
		616452097L, 3188863436L, 2780382310L, 2340014831L, 1208439576L,
		258356309L, 3837963200L, 2075009450L, 3214181212L, 3303882142L,
		880813252L, 1355575717L, 207231484L, 2420803184L, 358923368L,
		1617557768L, 3272161958L, 1771154147L, 2842106362L, 1751209208L,
		1421030790L, 658316681L, 194065839L, 3241510581L, 38625260L,
		301875395L, 4176141739L, 297312930L, 2137802113L, 1502984205L,
		3669376622L, 3728477036L, 234652930L, 2213589897L, 2734638932L,
		1129721478L, 3187422815L, 2859178611L, 3284308411L, 3819792700L,
		3557526733L, 451874476L, 1740576081L, 3592838701L, 1709429513L,
		3702918379L, 3533351328L, 1641660745L, 179350258L, 2380520112L,
		3936163904L, 3685256204L, 3156252216L, 1854258901L, 2861641019L,
		3176611298L, 834787554L, 331353807L, 517858103L, 3010168884L,
		4012642001L, 2217188075L, 3756943137L, 3077882590L, 2054995199L,
		3081443129L, 3895398812L, 1141097543L, 2376261053L, 2626898255L,
		2554703076L, 401233789L, 1460049922L, 678083952L, 1064990737L,
		940909784L, 1673396780L, 528881783L, 1712547446L, 3629685652L,
		1358307511L
	};

	private static final long[] V1 = {
		807385413L, 2043073223L, 3336749796L, 1302105833L, 2278607931L,
		541015020L, 1684564270L, 372709334L, 3508252125L, 1768346005L,
		1270451292L, 2603029534L, 2049387273L, 3891424859L, 2152948345L,
		4114760273L, 915180310L, 3754787998L, 700503826L, 2131559305L,
		1308908630L, 224437350L, 4065424007L, 3638665944L, 1679385496L,
		3431345226L, 1779595665L, 3068494238L, 1424062773L, 1033448464L,
		4050396853L, 3302235057L, 420600373L, 2868446243L, 311689386L,
		259047959L, 4057180909L, 1575367248L, 4151214153L, 110249784L,
		3006865921L, 4293710613L, 3501256572L, 998007483L, 499288295L,
		1205710710L, 2997199489L, 640417429L, 3044194711L, 486690751L,
		2686640734L, 2394526209L, 2521660077L, 49993987L, 3843885867L,
		4201106668L, 415906198L, 19296841L, 2402488407L, 2137119134L,
		1744097284L, 579965637L, 2037662632L, 852173610L, 2681403713L,
		1047144830L, 2982173936L, 910285038L, 4187576520L, 2589870048L,
		989448887L, 3292758024L, 506322719L, 176010738L, 1865471968L,
		2619324712L, 564829442L, 1996870325L, 339697593L, 4071072948L,
		3618966336L, 2111320126L, 1093955153L, 957978696L, 892010560L,
		1854601078L, 1873407527L, 2498544695L, 2694156259L, 1927339682L,
		1650555729L, 183933047L, 3061444337L, 2067387204L, 228962564L,
		3904109414L, 1595995433L, 1780701372L, 2463145963L, 307281463L,
		3237929991L, 3852995239L, 2398693510L, 3754138664L, 522074127L,
		146352474L, 4104915256L, 3029415884L, 3545667983L, 332038910L,
		976628269L, 3123492423L, 3041418372L, 2258059298L, 2139377204L,
		3243642973L, 3226247917L, 3674004636L, 2698992189L, 3453843574L,
		1963216666L, 3509855005L, 2358481858L, 747331248L, 1957348676L,
		1097574450L, 2435697214L, 3870972145L, 1888833893L, 2914085525L,
		4161315584L, 1273113343L, 3269644828L, 3681293816L, 412536684L,
		1156034077L, 3823026442L, 1066971017L, 3598330293L, 1979273937L,
		2079029895L, 1195045909L, 1071986421L, 2712821515L, 3377754595L,
		2184151095L, 750918864L, 2585729879L, 4249895712L, 1832579367L,
		1192240192L, 946734366L, 31230688L, 3174399083L, 3549375728L,
		1642430184L, 1904857554L, 861877404L, 3277825584L, 4267074718L,
		3122860549L, 666423581L, 644189126L, 226475395L, 307789415L,
		1196105631L, 3191691839L, 782852669L, 1608507813L, 1847685900L,
		4069766876L, 3931548641L, 2526471011L, 766865139L, 2115084288L,
		4259411376L, 3323683436L, 568512177L, 3736601419L, 1800276898L,
		4012458395L, 1823982L, 27980198L, 2023839966L, 869505096L,
		431161506L, 1024804023L, 1853869307L, 3393537983L, 1500703614L,
		3019471560L, 1351086955L, 3096933631L, 3034634988L, 2544598006L,
		1230942551L, 3362230798L, 159984793L, 491590373L, 3993872886L,
		3681855622L, 903593547L, 3535062472L, 1799803217L, 772984149L,
		895863112L, 1899036275L, 4187322100L, 101856048L, 234650315L,
		3183125617L, 3190039692L, 525584357L, 1286834489L, 455810374L,
		1869181575L, 922673938L, 3877430102L, 3422391938L, 1414347295L,
		1971054608L, 3061798054L, 830555096L, 2822905141L, 167033190L,
		1079139428L, 4210126723L, 3593797804L, 429192890L, 372093950L,
		1779187770L, 3312189287L, 204349348L, 452421568L, 2800540462L,
		3733109044L, 1235082423L, 1765319556L, 3174729780L, 3762994475L,
		3171962488L, 442160826L, 198349622L, 45942637L, 1324086311L,
		2901868599L, 678860040L, 3812229107L, 19936821L, 1119590141L,
		3640121682L, 3545931032L, 2102949142L, 2828208598L, 3603378023L,
		4135048896L
	};
	
	private static final long[] V2 = {
		1629829892L, 282540176L, 2794583710L, 496504798L, 2990494426L,
		3070701851L, 2575963183L, 4094823972L, 2775723650L, 4079480416L,
		176028725L, 2246241423L, 3732217647L, 2196843075L, 1306949278L,
		4170992780L, 4039345809L, 3209664269L, 3387499533L, 293063229L,
		3660290503L, 2648440860L, 2531406539L, 3537879412L, 773374739L,
		4184691853L, 1804207821L, 3347126643L, 3479377103L, 3970515774L,
		1891731298L, 2368003842L, 3537588307L, 2969158410L, 4230745262L,
		831906319L, 2935838131L, 264029468L, 120852739L, 3200326460L,
		355445271L, 2296305141L, 1566296040L, 1760127056L, 20073893L,
		3427103620L, 2866979760L, 2359075957L, 2025314291L, 1725696734L,
		3346087406L, 2690756527L, 99815156L, 4248519977L, 2253762642L,
		3274144518L, 598024568L, 3299672435L, 556579346L, 4121041856L,
		2896948975L, 3620123492L, 918453629L, 3249461198L, 2231414958L,
		3803272287L, 3657597946L, 2588911389L, 242262274L, 1725007475L,
		2026427718L, 46776484L, 2873281403L, 2919275846L, 3177933051L,
		1918859160L, 2517854537L, 1857818511L, 3234262050L, 479353687L,
		200201308L, 2801945841L, 1621715769L, 483977159L, 423502325L,
		3689396064L, 1850168397L, 3359959416L, 3459831930L, 841488699L,
		3570506095L, 930267420L, 1564520841L, 2505122797L, 593824107L,
		1116572080L, 819179184L, 3139123629L, 1414339336L, 1076360795L,
		512403845L, 177759256L, 1701060666L, 2239736419L, 515179302L,
		2935012727L, 3821357612L, 1376520851L, 2700745271L, 966853647L,
		1041862223L, 715860553L, 171592961L, 1607044257L, 1227236688L,
		3647136358L, 1417559141L, 4087067551L, 2241705880L, 4194136288L,
		1439041934L, 20464430L, 119668151L, 2021257232L, 2551262694L,
		1381539058L, 4082839035L, 498179069L, 311508499L, 3580908637L,
		2889149671L, 142719814L, 1232184754L, 3356662582L, 2973775623L,
		1469897084L, 1728205304L, 1415793613L, 50111003L, 3133413359L,
		4074115275L, 2710540611L, 2700083070L, 2457757663L, 2612845330L,
		3775943755L, 2469309260L, 2560142753L, 3020996369L, 1691667711L,
		4219602776L, 1687672168L, 1017921622L, 2307642321L, 368711460L,
		3282925988L, 213208029L, 4150757489L, 3443211944L, 2846101972L,
		4106826684L, 4272438675L, 2199416468L, 3710621281L, 497564971L,
		285138276L, 765042313L, 916220877L, 3402623607L, 2768784621L,
		1722849097L, 3386397442L, 487920061L, 3569027007L, 3424544196L,
		217781973L, 2356938519L, 3252429414L, 145109750L, 2692588106L,
		2454747135L, 1299493354L, 4120241887L, 2088917094L, 932304329L,
		1442609203L, 952586974L, 3509186750L, 753369054L, 854421006L,
		1954046388L, 2708927882L, 4047539230L, 3048925996L, 1667505809L,
		805166441L, 1182069088L, 4265546268L, 4215029527L, 3374748959L,
		373532666L, 2454243090L, 2371530493L, 3651087521L, 2619878153L,
		1651809518L, 1553646893L, 1227452842L, 703887512L, 3696674163L,
		2552507603L, 2635912901L, 895130484L, 3287782244L, 3098973502L,
		990078774L, 3780326506L, 2290845203L, 41729428L, 1949580860L,
		2283959805L, 1036946170L, 1694887523L, 4880696L, 466000198L,
		2765355283L, 3318686998L, 1266458025L, 3919578154L, 3545413527L,
		2627009988L, 3744680394L, 1696890173L, 3250684705L, 4142417708L,
		915739411L, 3308488877L, 1289361460L, 2942552331L, 1169105979L,
		3342228712L, 698560958L, 1356041230L, 2401944293L, 107705232L,
		3701895363L, 903928723L, 3646581385L, 844950914L, 1944371367L,
		3863894844L, 2946773319L, 1972431613L, 1706989237L, 29917467L,
		3497665928L
	};
	
	private static final long[] V3 = {
		1191369816L, 744902811L, 2539772235L, 3213192037L, 3286061266L,
		1200571165L, 2463281260L, 754888894L, 714651270L, 1968220972L,
		3628497775L, 1277626456L, 1493398934L, 364289757L, 2055487592L,
		3913468088L, 2930259465L, 902504567L, 3967050355L, 2056499403L,
		692132390L, 186386657L, 832834706L, 859795816L, 1283120926L,
		2253183716L, 3003475205L, 1755803552L, 2239315142L, 4271056352L,
		2184848469L, 769228092L, 1249230754L, 1193269205L, 2660094102L,
		642979613L, 1687087994L, 2726106182L, 446402913L, 4122186606L,
		3771347282L, 37667136L, 192775425L, 3578702187L, 1952659096L,
		3989584400L, 3069013882L, 2900516158L, 4045316336L, 3057163251L,
		1702104819L, 4116613420L, 3575472384L, 2674023117L, 1409126723L,
		3215095429L, 1430726429L, 2544497368L, 1029565676L, 1855801827L,
		4262184627L, 1854326881L, 2906728593L, 3277836557L, 2787697002L,
		2787333385L, 3105430738L, 2477073192L, 748038573L, 1088396515L,
		1611204853L, 201964005L, 3745818380L, 3654683549L, 3816120877L,
		3915783622L, 2563198722L, 1181149055L, 33158084L, 3723047845L,
		3790270906L, 3832415204L, 2959617497L, 372900708L, 1286738499L,
		1932439099L, 3677748309L, 2454711182L, 2757856469L, 2134027055L,
		2780052465L, 3190347618L, 3758510138L, 3626329451L, 1120743107L,
		1623585693L, 1389834102L, 2719230375L, 3038609003L, 462617590L,
		260254189L, 3706349764L, 2556762744L, 2874272296L, 2502399286L,
		4216263978L, 2683431180L, 2168560535L, 3561507175L, 668095726L,
		680412330L, 3726693946L, 4180630637L, 3335170953L, 942140968L,
		2711851085L, 2059233412L, 4265696278L, 3204373534L, 232855056L,
		881788313L, 2258252172L, 2043595984L, 3758795150L, 3615341325L,
		2138837681L, 1351208537L, 2923692473L, 3402482785L, 2105383425L,
		2346772751L, 499245323L, 3417846006L, 2366116814L, 2543090583L,
		1828551634L, 3148696244L, 3853884867L, 1364737681L, 2200687771L,
		2689775688L, 232720625L, 4071657318L, 2671968983L, 3531415031L,
		1212852141L, 867923311L, 3740109711L, 1923146533L, 3237071777L,
		3100729255L, 3247856816L, 906742566L, 4047640575L, 4007211572L,
		3495700105L, 1171285262L, 2835682655L, 1634301229L, 3115169925L,
		2289874706L, 2252450179L, 944880097L, 371933491L, 1649074501L,
		2208617414L, 2524305981L, 2496569844L, 2667037160L, 1257550794L,
		3399219045L, 3194894295L, 1643249887L, 342911473L, 891025733L,
		3146861835L, 3789181526L, 938847812L, 1854580183L, 2112653794L,
		2960702988L, 1238603378L, 2205280635L, 1666784014L, 2520274614L,
		3355493726L, 2310872278L, 3153920489L, 2745882591L, 1200203158L,
		3033612415L, 2311650167L, 1048129133L, 4206710184L, 4209176741L,
		2640950279L, 2096382177L, 4116899089L, 3631017851L, 4104488173L,
		1857650503L, 3801102932L, 445806934L, 3055654640L, 897898279L,
		3234007399L, 1325494930L, 2982247189L, 1619020475L, 2720040856L,
		885096170L, 3485255499L, 2983202469L, 3891011124L, 546522756L,
		1524439205L, 2644317889L, 2170076800L, 2969618716L, 961183518L,
		1081831074L, 1037015347L, 3289016286L, 2331748669L, 620887395L,
		303042654L, 3990027945L, 1562756376L, 3413341792L, 2059647769L,
		2823844432L, 674595301L, 2457639984L, 4076754716L, 2447737904L,
		1583323324L, 625627134L, 3076006391L, 345777990L, 1684954145L,
		879227329L, 3436182180L, 1522273219L, 3802543817L, 1456017040L,
		1897819847L, 2970081129L, 1382576028L, 3820044861L, 1044428167L,
		612252599L, 3340478395L, 2150613904L, 3397625662L, 3573635640L,
		3432275192L
	};
}
