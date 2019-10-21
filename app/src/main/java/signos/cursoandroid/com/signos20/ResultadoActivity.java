package signos.cursoandroid.com.signos20;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView botaoVoltar;
    private ImageView imagemSigno;
    private TextView textoSigno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imagemSigno = (ImageView) findViewById(R.id.imageViewSignoId);
        textoSigno = (TextView) findViewById(R.id.textViewScrollId);
        botaoVoltar = (ImageView) findViewById(R.id.botaoVoltarId);


        Bundle extra = getIntent().getExtras();
        if (extra!=null){

            int opcapEscolha = extra.getInt("codigoPosicao");

            if (opcapEscolha == 0){ //Áries

                imagemSigno.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.aries));
                textoSigno.setText("21 de março - 19 de abril\n'Agressivo', 'Agitador', 'Individualista', 'Objetivo', 'Precipitado, 'Realista', 'Ativo'.\nConhecido por ser o signo da espontaneidade, Áries exala uma energia única que é toda vinda da sua vontade extraordinária de existir. Com fortes tendências a atividades instantâneas, Áries tem mania de pensar no momento atual, não se programando muito para o futuro.\nCaracterísticas boas: Aventureiro, Competitivo, Espontâneo, Apoia as causas sociais.\nCaracterísticas ruins: Não gosta de esperar, Fracasso, Errar, Conselhos alheios, Tirania.\nAMOR: Eles possuem uma alta libido e amam com muito fervor, porém com a mesma intensidade que essa paixão vem, ela vai. Arianos gostam de tudo aquilo que lhes tire da rotina, o ariano é imprevisível.\n*************\nFonte: www.significadodossonhos.inf.br");

            }else if ( opcapEscolha == 1){ //Touro
                imagemSigno.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.touro));
                textoSigno.setText("20 de abril - 21 de maio\n'Amante do Conforto', 'Vida Sensual', 'Sentimentalista', 'Emotivo', 'Sincero', 'Pacífico', 'Trabalhador', 'Esforçado'.\nPessoas de touro são conhecidas por serem pessoas serenas e muito calmas, altamente ligadas aos prazeres do corpo. Por odiar mudanças bruscas, é conhecido por acumular riquezas e ser sempre muito bem sucedido financeiramente, uma consequências de sua grande capacidade de planejamento a longo prazo. O touro, nos grupos de amigos, é geralmente o mais rico e trabalhador e ai de quem duvidar de sua capacidade de sustentar a si mesmo e sua família.\nCaracterísticas boas: Determinado, Trabalhador, Entrega-se de corpo e alma, Estável - não muda de ideia fácil, Paciente, Amoroso, Fiel\nCaracterísticas ruins: Ciumento, Materialista, Teimoso, Pode ser um pouco egoísta, Sensível às dores da vida, Possessivo.\nAMOR: Pessoas de Touro no amor costumam ser muito apaixonadas, porém demoram um tempo para conseguir confiar no outro, precisam de compromissos sérios em sua vida, além de dedicação total por parte do parceiro. É extremamente ciumento e possessivo, o que pode causar muitos problemas no relacionamento à dois. Aprenda a se controlar." +
                        "\nA pessoa ideal para alguém de Touro tem que ser bonita, discreta, madura e que estão sempre impecáveis. Precisam mostrar que querem um compromisso sério, são fiéis e que também darão todo o suporte emocional que o taurino ou taurina precisam. Quer um relacionamento sério, duradouro e estável? É com Touro!\n*************\nFonte: www.significadodossonhos.inf.br");
            }else if ( opcapEscolha == 2){ //Gêmeos
                imagemSigno.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.gemeos));
                textoSigno.setText("21 de maio - 20 de junho" +
                        "\n'Comunicativo', 'Inteligente', 'Alegre', 'Charmoso', 'Ativo', 'Persuasivo', 'Dupla Personalidade'." +
                        "\nSeu maior ponto forte é a inteligência, eles conseguem se adaptar à qualquer situação e ambiente. Se expressam muito bem e junto com essa habilidade vem o grande poder de persuasão do signo – eles escolhem cada palavra meticulosamente. É muito difícil escapar deles e vencer uma discussão, geminianos têm argumentos para tudo." +
                        "\nAMOR: Geminianos entendem e muito de paquera e sabem seduzir, porém gostam mesmo é de namorar. No começo são leves e bem humorados, porém ao se aprofundar mais nas relações podem mostrar seu lado mais complexo. Se você não é bastante cabeça aberta e compreensivo(a), as coisas podem se complicar." +
                        "\nEles tem medo de se deixarem levar pelas emoções e é por isso que insistem em manter-se firmes e racionais. Afinal, sabem que não nasceram para serem confinados e sabem muito bem disso. Para a relação dar certo, precisam de estímulo constante. Gostam de se sentir desejados pelo(a) parceiro(a) e pelo mundo. Estão sempre atrás de novidades e trazendo novas oportunidades para suas vidas." +
                        "\n" +
                        "*************\n" +
                        "Fonte: www.significadodossonhos.inf.br");
            }else if ( opcapEscolha == 3){ //Câncer
                imagemSigno.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.cancer));
                textoSigno.setText("21 de junho - 22 de julho" +
                        "\n'Sensual', 'Ouvinte', 'Tímido', 'Sensível', 'Romântico', 'Sonhador', 'Carente', 'Imaginativo', 'Fechado'." +
                        "\nSão conhecidos por serem direcionados especialmente pelas suas emoções, são pessoas altamente carinhosas, protetoras daqueles que amam e também simpáticos quando querem. Eles possuem uma imaginação aguçada e também muita intuição, além de serem sempre cautelosos." +
                        "\nSão reconhecidos também pela sua mudança de humor repentina, além de calculistas, manipuladores, desordenadas e também suscetíveis." +
                        "\nAMOR: São conhecidos pela sua lealdade acima de tudo, mesmo que mantenham relações extraconjugais – o que é muito comum por ser um signo altamente ligado a excitação sexual -, ele ainda tem como principal dever cuidar de sua família e filhos, tudo isso por ser o protetor." +
                        "\nCancerianos se magoam facilmente e costumam desenvolver traumas mais rapidamente do que outros signos do zodíaco. Isso faz com que eles possam se sentir melhores sozinhos ou ter problemas no encontro do par certo: são bastante exigentes quando o assunto é a formação de família." +
                        "\n" +
                        "*************\n" +
                        "Fonte: www.significadodossonhos.inf.br");
            }else if ( opcapEscolha == 4){ //Leão
                imagemSigno.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.leao));
                textoSigno.setText("22 de julho - 22 de agosto" +
                        "\n'Confiante', 'Brilhante', 'Energético', 'Realista', 'Fiel', 'Criativo', 'Forte', 'Leal', 'Vaidoso', 'Honesto'." +
                        "\nSão marcados pela impulsividade, você dificilmente os verá refletindo sobre as decisões que irão tomar." +
                        "\nOutra das suas maiores características é a independência. Contam apenas com eles mesmos para chegarem onde querem na vida. Pessoas de Leão são extremamente auto-suficiente e gostam da sua liberdade. Também são dotados de energia e sinceridade, até demais." +
                        "\nAMOR: Eles são bastante desiludidos, em um dia estão bastante desinteressados, no outro o encanto acaba. Se frustram facilmente com ambiguidade, ciúmes e a maldade presentes no ser humano. Mas jamais deixaram esses sentimentos aparente, fazendo o possível para escondê-los." +
                        "\nEles dificilmente se apaixonam, mas quando isso acontece, sabem como ser românticos e, se isso acontecer, não te faltará amor e sexo. A pessoa amada se sentirá nas nuvens e não lhe faltará sentimento e esforço para a manutenção do relacionamento." +
                        "\nEles não fazem o tipo submisso, querem fazer suas próprias vontades. Precisam expressar todo seu impulso criativo e por isso odeiam se sentir presos. Outra coisa que odeiam é fazer o papel de vitima ou tolo." +
                        "\n*************\n" +
                        "Fonte: www.significadodossonhos.inf.br");
            }else if ( opcapEscolha == 5){ //Virgem
                imagemSigno.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.virgem));
                textoSigno.setText("23 de agosto - 22 de setembro" +
                        "\n'Dedicado', 'Fiel', 'Trabalhador', 'Perfeccionista', 'Organizado', 'Racional', 'Exigente', 'Fechado'." +
                        "\nSua característica mais marcante é a ordem e a limpeza. Quer deixar um virginiano louco? Deixe todas as coisas dele bagunçadas. Mas também não é uma regra, existem algumas exceções entre eles que vivem no meio do caos e bagunça." +
                        "\nIsso já é um ponto para você entrar em sua rotina, o seu relacionamento se prejudicará se ele tiver dificuldade em enxergar seus objetivos com clareza, por isso eles preferem ter tudo e os demais sob controle, daí sua necessidade de comandar." +
                        "\nA verdade é que eles enxergam tudo ao seu redor, prestando atenção aos mínimos detalhes. Também são discretos e críticos, o que faz com que muita gente não goste da convivência com eles. Conseguem pensar em melhorias pra tudo e todos ao seu redor, nada nunca estará perfeito e eles precisam aprender a conviver com isso." +
                        "\nAMOR: Dificilmente se entregam, são frios, distantes e nada românticos. Quando finalmente se apaixonam, não poderia ser diferente – adoram regras. São o tipo de pessoa que gosta daquele romance que se encaixa nos livros e histórias de amor. Tendem a ser um pouco controladores, mas são facilmente controlados, como uma das principais características de signos de terra." +
                        "\nSeu lado emocional costuma ser caótico e confuso, nem eles mesmos conseguem acessar muito bem essa área de sua personalidade. Vai ser preciso paciência para conquistá-los." +
                        "\nGeralmente não demonstram ciúmes, porém acabam vigiando o parceiro mesmo que não pareça. O par perfeito para alguém de Virgem é aquela pessoa que dê total segurança e entenda o jeito sistemático desse signo." +
                        "\n*************\nFonte: www.significadodossonhos.inf.br");
            }else if ( opcapEscolha == 6){ //Libra
                imagemSigno.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.libra));
                textoSigno.setText("23 de setembro - 22 de outubro" +
                        "\n'Simpático', 'Observador', 'Equilibrado', 'Determinado', 'Extrovertido', 'Delicado', 'Querido', 'Indeciso'." +
                        "\nLibra é um dos signos mais agradáveis do zodíaco, é impossível não gostar deles. Amam e precisam socializar, cativando todos ao seu redor, quando se encontra com os amigos, é sempre uma festa. Eles tem uma vivacidade não encontrada em nenhum outro signo, sabem levar os relacionamentos muito bem, dos signos do Zodíaco, libra é refinado, prioriza o sexo no relacionamento mas não tanto quanto uma boa conversa." +
                        "\nSua prioridade é manter uma ambiente sereno, então fazem de tudo para não iniciar um conflito, fugindo das brigas. Gostam de harmonia e tentam mantê-la custe o que custar, deixando de lado até mesmo algumas de suas responsabilidades, dentro os signos e características, libra não se poupa quando precisam ajudar outros." +
                        "\nAMOR: Para librianos estar com alguém é um fator muito importante nas suas vidas, isso porque adoram companhia. Se sentem solitários quando passam um tempo sozinhos. São muito românticos e sua habilidade em lidar com os outros rapidamente cativa a pessoa amada, o amor de homem libriano quanto o amor de mulher libriana é libra em seu território natural." +
                        "\nEles são muito afetuosos, mas para isso precisam estar seguros na relação. Então acabam por exigir um compromisso certo e sem muitas falhas do(a) parceiro(a). Não são pessoas muito ciumentas porque sabem lidar com esse sentimento. Antes de se envolverem em uma briga costumam avaliar o quanto vale a pena tocar no assunto. O diálogo é sempre o melhor caminho." +
                        "\n*************\nFonte: www.significadodossonhos.inf.br");
            }else if ( opcapEscolha == 7){ //Escorpião
                imagemSigno.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.escorpiao));
                textoSigno.setText("23 de outubro - 21 de novembro" +
                        "\n'Independente', 'Inteligente', 'Persistente', 'Extremista', 'Emotivo', 'Exigente', 'Corajoso', 'Criativo'." +
                        "\nSão conhecidos por serem pessoas frias e calculistas, porém isso é apenas uma proteção para que não entreguem seus sentimentos de uma vez por todas. Não costumam expressar sentimentos, tudo isso por medo da rejeição, desse modo não são facilmente compreendidos. Escorpião não gosta de se mostrar indefeso, isso afeta o seu bem estar, além de ele também se sente incapaz de lidar com esse sentimento de incapacidade." +
                        "\nEstão frequentemente envolvidos em brigas e possuem uma grande sede de vingança. Também são ciumentos ao extremo, possuem um sentimento de posse incontrolável diante daquilo que amam." +
                        "\nPossuem uma sexualidade acentuada, assim como um magnetismo forte, porém guardam isso para si mesmo. Um escorpiano quando sente, sente profundamente todas as sensações que existem, ele se afunda naquilo que o domina. O nativo de Escorpião costuma sofrer em silêncio em seus pensamentos, também não espere que ele externalize, isso não é fácil. Uma das principais características dos signos de água no geral é a de esconder o jogo até o último momento." +
                        "\nAMOR: Escorpião no amor são pessoas fiéis com quem amam, sempre dispostos a estar ali quando é necessário, porém demoram para estabelecer relações com os demais, tudo isso por serem desconfiados e irem devagar em suas relações interpessoais. Tudo que Escorpião faz é pensado para não se machucar, você sabe bem se este é o teu signo." +
                        "\nÉ uma pessoa que se entrega totalmente, porém isso também faz com que seja muito ciumento, querendo sempre controlar o outro, chegando em níveis de perseguição. Caso desconfie que esteja sendo traído, pode pensar nas maneiras mais horríveis de vingança. Quando está tudo bem, é uma pessoa super leal, afetuosa e emotiva." +
                        "\n*************\nFonte: www.significadodossonhos.inf.br");
            }else if ( opcapEscolha == 8){ //Sagitário
                imagemSigno.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.sagitario));
                textoSigno.setText("22 de novembro - 21 de dezembro" +
                        "\n'Estudioso', 'Amante da Liberdade', 'Simpático', 'Tolerante', 'Honesto', 'Otimista', 'Dançarino'." +
                        "\nSão pessoas apaixonadas pela liberdade e conhecidos pela busca eterna pela aventura. Sempre cheios de energia, positivos e em busca da renovação, é um signo que adora mudanças e está sempre buscando por novos ares. O horóscopo de Sagitário geralmente composto de se ter paciência e equilíbrio nos desafios da rotina, afinal, não pode se sair abandonando tudo por aí porque Sagitário ama a liberdade." +
                        "\nPor ser regido pelo signo de fogo, está sempre precisando de novos impulsos para se sentir vivo, por isso rotina não é algo que você vai encontrar com uma pessoa de Sagitário. Isso pode ser considerado algo horrível pelas outras pessoas, afinal, falta um pouco de estabilidade e uma linearidade nos sagitarianos." +
                        "\nAMOR: No relacionamento e vida amorosa, sagitarianos não são muito apegados e estão sempre se apaixonando a cada minuto. Não costumam gostar e nem se sentir a vontade com pessoas ciumentas e que estão sempre pegando no seu pé." +
                        "\nÉ o signo que prioriza a liberdade, por isso, pessoas controladoras e que gostam de ter o controle não são uma boa ideia para sagitarianos. Sagitário precisa de um relacionamento espontâneo, com muito companheirismo e confiança. A pessoa desse signo também precisa que seus amigos façam amizade com seus amigos." +
                        "\n*************\nFonte: www.significadodossonhos.inf.br");
            }else if ( opcapEscolha == 9){ //Capricórnio
                imagemSigno.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.capricornio));
                textoSigno.setText("22 de dezembro - 20 de janeiro" +
                        "\n'Responsável', 'Dominador', 'Tradicional', 'Rancoroso', 'Honesto', 'Ambicioso', 'Maduro', 'Prático'." +
                        "\nPodem muitas vezes serem considerados materialistas, devido à alta importância que dão para as coisas. Eles irão se esforçar para subir na vida, alcançando sucesso e poder. Uma das principais características do signo é de que Capricórnio no trabalho é super empenhado, pois não quer perder a segurança e conforto tão desejados." +
                        "\nMarcados por serem trabalhadores, ambiciosos e muito persistentes, possuem uma força de vontade invejável. Misteriosos, costumam guardar seus segredos a sete chaves. Você dificilmente verá alguém desse signo deixando outras pessoas entrarem em suas vidas. Capricorniano é difícil de se conquistar, tanto o homem desse signo quanto a mulher." +
                        "\nAMOR: São bastante exigentes e rigorosos, dificilmente deixam alguém entrar em suas vidas. Gostam de pessoas práticas ao seu redor e procuram alguém com quem possam alinhar seus objetivos de vida. O Capricórnio signo em outros locais do seu mapa astral pode interferir na astrologia e signos principais, veja aqui o que acontece se você tem ele no seu ascendente em Capricórnio." +
                        "\nUma pessoa que costuma ser muito amável, fiel e companheira, ele gosta de dar e receber carinho, porém demora para se entregar para a outra pessoa. Esse é um signo que preza pela confiança e gosta de estar no comando, também preza que duas pessoas estejam sempre apoiando uma a outra no seu crescimento pessoal." +
                        "\n*************\nFonte: www.significadodossonhos.inf.br");
            }else if ( opcapEscolha == 10){ //Aquário
                imagemSigno.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.aquario));
                textoSigno.setText("21 de janeiro - 19 de fevereiro" +
                        "\n'Bondoso', 'Amigo', 'Excêntrico', 'Comunicativo', 'Sonhador', 'Líder', 'Rebelde', 'Atraente'." +
                        "\n Conhecidos por serem pessoas humanitárias e muito simpáticas, aquarianos são leais, originais e possuem uma personalidade única. Gostam de contrariar, são teimosos e não costumam aceitar a opinião alheia que não seja condizente com a deles." +
                        "\nLutam até o final pelas causas que acreditam, sonham alto e possuem uma grande quantidade de amigos. Ele também fica a espreita analisando quais as possibilidades de determinado assunto vingar, caso percebem que isso não passa de uma mera imitação ou cópia, irão se afastar." +
                        "\nPor serem pessoas que priorizam o lado racional, as vezes podem parecer insensíveis ou que são frios. Porém, quando se apaixonam se deixam envolver completamente com o par. É uma pessoa fiel porém precisa de espaço e muita liberdade." +
                        "\nÉ uma pessoa que acredita que o casal não deve deixar de ser individual, sendo que nenhum deve viver em função do outro. Precisa de uma pessoa animada e com criatividade ao seu lado, além de alguém que valorize a liberdade e assim possam ter um romance." +
                        "\n*************\nFonte: www.significadodossonhos.inf.br");
            }else if ( opcapEscolha == 11){ //Peixes
                imagemSigno.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.peixes));
                textoSigno.setText("20 de fevereiro - 20 de março" +
                        "\n'Tímido', 'Indeciso', 'Sensível', 'Sonhador', 'Tranquilo', 'Nobre', 'Flexível', 'Apaixonado'." +
                        "\nEles odeiam se sentir presos. Assim como a água, gostam de fluir para onde a vida os levar. Mas carregam sempre consigo o seu passado, tudo o que já viveram e memórias dos momentos pelos quais passaram." +
                        "\nPiscianos costumam valorizar sempre um todo, não costumam pensar por cada indivíduo." +
                        "\nAcham que o bem maior é mais importante do que o individual, se preocupando muito com o coletivo. Peixes são pessoas muito amáveis e possuem um coração cheio de compaixão. São muito imaginativos e essa sensibilidade os faz pensar muito nos outros, pois são empáticos e se colocam muito no lugar das pessoas ao seu redor. Jamais fazem para alguém aquilo que não gostariam que fosse lhes feito." +
                        "\nEles adoram ficar sozinho e refletir sobre todo o universo que criam dentro das suas próprias mentes. São muito sonhadores, adorando coisas misteriosas, inclusive o ridículo. Por outro lado, odeiam pessoas exibidas e também detestam ser criticados, taxados ou impedidos de sonhar." +
                        "\nAMOR: Na família os piscianos são super dedicados. Tomam os relacionamentos com mais próximos verdadeiras responsabilidades, quais não abrem mão. Nem se arrisque a fazer uma crítica a um familiar de um pisciano." +
                        "\nPiscianos são românticos incorrigíveis,  o signo do zodíaco que mais se doa para os outros em suas relações: presenteiam, dedicam-se a família, tomam compromissos e ignoram todo o resto para dar a atenção necessária aqueles que ama." +
                        "\nSão incríveis e todos os sentimentos que demonstram são sinceros e genuínos. Acredite, ele nunca ficaria com alguém que não tivesse verdadeiro afeto. No entanto, apaixona-se com facilidade e está sempre amando mais de uma pessoa ao mesmo tempo.  Apesar de conquistar um pisciano não ser uma tarefa difícil, você pode ter dificuldades de mudar a opinião dele por você quando essa já foi formada." +
                        "\n*************\nFonte: www.significadodossonhos.inf.br");
            }

        }


        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ResultadoActivity.this, MainActivity.class));
            }
        });

    }
}
