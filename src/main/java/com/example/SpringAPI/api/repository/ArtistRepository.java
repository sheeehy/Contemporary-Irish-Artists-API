package com.example.SpringAPI.api.repository;

import com.example.SpringAPI.api.model.Artist;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class ArtistRepository {
    private final List<Artist> artists;

    public Optional<Artist> findArtistById(Integer id) {
        return artists.stream()
                .filter(artist -> id.equals(artist.getId()))
                .findFirst();
    }

    public List<Artist> findArtistsByName(String name) {
        return artists.stream()
                .filter(artist -> artist.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    public List<Artist> findArtistsByStyle(String style) {
        return artists.stream()
                .filter(artist -> artist.getStyle().equalsIgnoreCase(style))
                .collect(Collectors.toList());
    }

    public ArtistRepository() {
        artists = new ArrayList<>();

        Artist KevinAbosch = new Artist(
                1, // id
                "Kevin Abosch", // name
                53, // age
                "1969-01-01", // birth
                null, // death
                "Kevin Abosch is an Irish conceptual artist and pioneer in cryptoart[2] known for his works in photography, blockchain, sculpture, installation, AI and film.", // bio
                "Conceptual", // style
                "https://en.wikipedia.org/wiki/Kevin_Abosch" // wikipedia
        );

        Artist aideenBarry = new Artist(
                2, // id
                "Aideen Barry", // name
                44, // age
                "1979-08-31", // birth
                null, // death
                "Barry works in video, animation, sound, installation, drawing, and performance and often deals with issues of domestic labour.", // bio
                "Film", // style
                "https://en.wikipedia.org/wiki/Aideen_Barry" // wikipedia
        );

        Artist shaneBerkery = new Artist(
                3, // id
                "Shane Berkery", // name
                31, // age
                "1992-04-09", // birth
                null, // death
                "Shane Keisuke Berkery is an Irish-Japanese contemporary artist based in Dublin, Ireland.", // bio
                "Contemporary", // style
                "https://en.wikipedia.org/wiki/Shane_Berkery" // wikipedia
        );

        Artist sarahBrowne = new Artist(
                4, // id
                "Sarah Browne", // name
                42, // age
                "1981-01-01", // birth
                null, // death
                "Sarah Browne is a contemporary Irish artist who works in public art, performance, sculpture, and collaboration.", // bio
                "Sculpture", // style
                "https://en.wikipedia.org/wiki/Sarah_Browne" // wikipedia
        );

        Artist lauraBuckley = new Artist(
                5, // id
                "Laura Buckley", // name
                53, // age
                "1977-01-01", // birth
                "2022-01-01", // death
                "Laura Buckley was an Irish video and installation artist, and sculptor. Born in Galway, Ireland, she lived and worked in London.", // bio
                "Installation", // style
                "https://en.wikipedia.org/wiki/Laura_Buckley" // wikipedia
        );

        Artist gerardByrne = new Artist(
                6, // id
                "Gerard Byrne", // name
                65, // age
                "1958-03-29", // birth
                null, // death
                "Gerard Byrne is an Irish figurative painter. His artwork encompasses various themes from landscapes and architecture painted both in his native Ireland and on foreign travels, through still life to the floral and figurative works. ", // bio
                "Figurative", // style
                "https://en.wikipedia.org/wiki/Gerard_Byrne_(artist,_born_1958)" // wikipedia
        );

        Artist johnByrne  = new Artist(
                7, // id
                "John Byrne", // name
                0, // age
                null, // birth
                null, // death
                "John Byrne is a contemporary artist born in Belfast, Northern Ireland, he now lives and works in Dublin.", // bio
                "Nationalism", // style
                "https://en.wikipedia.org/wiki/John_Byrne_(Irish_artist)" // wikipedia
        );

        Artist duncanCampbell = new Artist(
                8, // id
                "Duncan Campbell", // name
                51, // age
                "1972-01-01", // birth
                null, // death
                "Duncan Campbell is an Irish video artist, based in Glasgow. He was the winner of the 2014 Turner Prize.", // bio
                "Video", // style
                "https://en.wikipedia.org/wiki/Duncan_Campbell_(artist)" // wikipedia
        );

        Artist NiccolodArdiaCaracciolo = new Artist(
                9, // id
                "Niccolo d'Ardia Caracciolo", // name
                48, // age
                "1941-09-18", // birth
                "1989-12-16", // death
                "Niccolo d'Ardia Caracciolo, known as Niccolo or Nick Caracciolo, was an Irish artist known for his portraits and landscapes.", // bio
                "Portraits, Landscapes", // style
                "https://en.wikipedia.org/wiki/Niccolo_d%27Ardia_Caracciolo" // wikipedia
        );

        Artist anneCleary = new Artist(
                10, // id
                "Anne Cleary\n", // name
                58, // age
                "1965-01-01", // birth
                null, // death
                "Anne Cleary is an installation and video artist.", // bio
                "Installation, Video", // style
                "https://en.wikipedia.org/wiki/Anne_Cleary" // wikipedia
        );

        Artist jamesColeman = new Artist(
                11, // id
                "James Coleman", // name
                82, // age
                "1941-01-01", // birth
                null, // death
                "James Coleman is an Irish installation and video artist associated with slide-tape works: sequences of still images fading one into the other with synchronized sound. ", // bio
                "Installation, Video", // style
                "https://en.wikipedia.org/wiki/James_Coleman_(Irish_artist)" // wikipedia
        );

        Artist denisConnolly = new Artist(
                12, // id
                "Denis Connolly", // name
                58, // age
                "1965-01-01", // birth
                null, // death
                "Denis Connolly (born 1965, Dun Laoghaire, Ireland) is an installation and video artist, and author.", // bio
                "Installation, Video", // style
                "https://en.wikipedia.org/wiki/Denis_Connolly" // wikipedia
        );

        Artist cearaConway = new Artist(
                13, // id
                "Ceara Conway", // name
                46, // age
                "1977-01-05", // birth
                null, // death
                "Ceara Conway is an independent Irish contemporary visual artist and vocalist from the Connemara Gaeltacht region in County Galway, in the west of Ireland.", // bio
                "Visual, Vocalist", // style
                "https://en.wikipedia.org/wiki/Ceara_Conway" // wikipedia
        );

        Artist amandaCoogan = new Artist(
                14, // id
                "Amanda Coogan", // name
                52, // age
                "1971-01-01", // birth
                null, // death
                "Amanda Coogan is an Irish performance artist, living and working in Dublin.", // bio
                "Preformance", // style
                "https://en.wikipedia.org/wiki/Amanda_Coogan" // wikipedia
        );

        Artist michaelCraigMartin = new Artist(
                15, // id
                "Michael Craig-Martin", // name
                81, // age
                "1941-08-28", // birth
                null, // death
                "Sir Michael Craig-Martin is an Irish-born contemporary conceptual artist and painter.", // bio
                "Conceptual", // style
                "https://en.wikipedia.org/wiki/Michael_Craig-Martin" // wikipedia
        );

        Artist dorothyCross = new Artist(
                16, // id
                "Dorothy Cross", // name
                67, // age
                "1956-01-01", // birth
                null, // death
                "Dorothy Cross is an Irish artist. Working with differing media, including sculpture, photography, video and installation, she represented Ireland at the 1993 Venice Biennale.", // bio
                "Sculpture, photography, video and installation", // style
                "https://en.wikipedia.org/wiki/Dorothy_Cross" // wikipedia
        );

        Artist colinDavidson = new Artist(
                17, // id
                "Colin Davidson", // name
                55, // age
                "1968-01-01", // birth
                null, // death
                "Colin Davidson is a Northern Irish visual artist, living and working near Belfast, Northern Ireland. An artist who works in themes, his recent large-scale head paintings have been exhibited worldwide.", // bio
                "Portraits", // style
                "https://en.wikipedia.org/wiki/Colin_Davidson_(artist)" // wikipedia
        );

        Artist niallDeBuitléar = new Artist(
                18, // id
                "Niall de Buitléar", // name
                40, // age
                "1983-01-01", // birth
                null, // death
                "Niall de (born 1983) is an Irish artist working in sculpture, painting, printmaking and drawing.", // bio
                "Sculpture, Painting", // style
                "https://en.wikipedia.org/wiki/Niall_de_Buitl%C3%A9ar" // wikipedia
        );

        Artist vivienneDick = new Artist(
                19, // id
                "Vivienne Dick", // name
                73, // age
                "1950-01-01", // birth
                null, // death
                "Vivienne Dick is an Irish feminist experimental and documentary filmmaker. Her early films helped define the No Wave scene.", // bio
                "Film", // style
                "https://en.wikipedia.org/wiki/Vivienne_Dick" // wikipedia
        );

        Artist felimEgan = new Artist(
                20, // id
                "Felim Egan", // name
                67, // age
                "1952-11-08", // birth
                "2020-11-19", // death
                "Felim Egan was an Irish painter", // bio
                "Abstract", // style
                "https://en.wikipedia.org/wiki/Felim_Egan" // wikipedia
        );

        Artist garyFarrelly = new Artist(
                21, // id
                "Gary Farrelly", // name
                40, // age
                "1983-01-01", // birth
                null, // death
                "Gary Farrelly (born 1983) is a contemporary Irish artist based in Brussels", // bio
                "Contemporary", // style
                "https://en.wikipedia.org/wiki/Gary_Farrelly" // wikipedia
        );

        Artist genieveFiggis = new Artist(
                22, // id
                "Genieve Figgis", // name
                51, // age
                "1972-01-01", // birth
                null, // death
                "Genieve Figgis is an Irish artist who started her artistic career using social media. She is known for her vibrant colors and ghoulish or macabre imagery.", // bio
                "Abstract", // style
                "https://en.wikipedia.org/wiki/Genieve_Figgis" // wikipedia
        );

        Artist johnGerrard = new Artist(
                23, // id
                "John Gerrard", // name
                48, // age
                "1974-07-20", // birth
                null, // death
                "John Gerrard is an Irish artist, best known for his sculptures, which typically take the form of digital simulations displayed using Real-time computer graphics.", // bio
                "Digital", // style
                "https://en.wikipedia.org/wiki/John_Gerrard_(artist)" // wikipedia
        );

        Artist marieHanlon = new Artist(
                24, // id
                "Marie Hanlon", // name
                74, // age
                "1948-12-20", // birth
                null, // death
                "Marie Hanlon is a Dublin-based Irish artist working in a variety of media including painting, drawing, sculpture, video and installation.", // bio
                "Contemporary, Surreal", // style
                "https://en.wikipedia.org/wiki/Marie_Hanlon" // wikipedia
        );

        Artist siobhánHapaska = new Artist(
                25, // id
                "Siobhán Hapaska", // name
                59, // age
                "1963-01-01", // birth
                null, // death
                "Siobhán Hapaska is an Irish sculptor", // bio
                "Sculpture", // style
                "https://en.wikipedia.org/wiki/Siobh%C3%A1n_Hapaska" // wikipedia
        );

        Artist gottfriedHelnwein = new Artist(
                26, // id
                "Gottfried Helnwein", // name
                74, // age
                "1948-10-08", // birth
                null, // death
                "Gottfried Helnwein  is an Austrian-Irish visual artist. He has worked as a painter, draftsman, photographer, muralist, sculptor, installation and performance artist, using a wide variety of techniques and media.", // bio
                "Contemporary, Hyper realism", // style
                "https://en.wikipedia.org/wiki/Gottfried_Helnwein" // wikipedia
        );

        Artist hilaryHenron = new Artist(
                27, // id
                "Hilary Heron", // name
                54, // age
                "1923-03-27", // birth
                "1977-04-28", // death
                "Hilary Heron was an Irish sculptor who exhibited with the Irish Exhibition of Living Art and represented Ireland at the 1956 Venice Biennale.", // bio
                "Sculpture", // style
                "https://en.wikipedia.org/wiki/Hilary_Heron" // wikipedia
        );

        Artist katieHolten = new Artist(
                28, // id
                "Katie Holten", // name
                47, // age
                "1975-09-22", // birth
                null, // death
                "Katie Holten is a contemporary Irish artist whose artwork focuses on humans' impact on the natural environment.", // bio
                "Political", // style
                "https://en.wikipedia.org/wiki/Katie_Holten" // wikipedia
        );

        Artist jakiIrvine = new Artist(
                29, // id
                "Jaki Irvine\n", // name
                56, // age
                "1966-01-01", // birth
                null, // death
                "Jaki Irvine is an Irish contemporary visual artist, specialising in music and video installations, and a novelist. She shares time between Dublin and Mexico City", // bio
                "Video", // style
                "https://en.wikipedia.org/wiki/Jaki_Irvine" // wikipedia
        );

        Artist louisLeBrocquy = new Artist(
                30, // id
                "Louis le Brocquy\n", // name
                95, // age
                "1916-11-10", // birth
                "2012-04-25", // death
                "Louis le Brocquy was an Irish painter born in Dublin to Albert and Sybil le Brocquy. His work received many accolades in a career that spanned some seventy years of creative practice.  ", // bio
                "Contemporary", // style
                "https://en.wikipedia.org/wiki/Louis_le_Brocquy" // wikipedia
        );

        Artist lesLevine = new Artist(
                31, // id
                "Les Levine", // name
                87, // age
                "1935-01-01", // birth
                null, // death
                "Les Levine is a naturalized American Irish artist known as a pioneer of video art and as a conceptual artist working with mass communication. In 1967, Levine won first prize for sculpture in the Canadian Sculpture Biennial ", // bio
                "Sculpture", // style
                "https://en.wikipedia.org/wiki/Les_Levine" // wikipedia
        );

        Artist garrettLynch = new Artist(
                32, // id
                "Garrett Lynch", // name
                45, // age
                "1977-01-01", // birth
                null, // death
                "Garrett Lynch is an Irish new media artist working with networked technologies in a variety of forms including online art, installation, performance and writing.", // bio
                "Digital", // style
                "https://en.wikipedia.org/wiki/Garrett_Lynch" // wikipedia
        );

        Artist seanLynch = new Artist(
                33, // id
                "Sean Lynch", // name
                45, // age
                "1978-01-01", // birth
                null, // death
                "Sean Lynch is a contemporary Irish visual artist. He lives and works in Askeaton, County Limerick, Ireland.", // bio
                "Contemporary", // style
                "https://en.wikipedia.org/wiki/Sean_Lynch_(artist)" // wikipedia
        );

        Artist eileenMacDonagh = new Artist(
                34, // id
                "Eileen MacDonagh", // name
                66, // age
                "1956-07-20", // birth
                null, // death
                "Eileen MacDonagh was born in Geevagh, County Sligo in 1956 and has worked as a sculptor since the 1980s.", // bio
                "Sculpture", // style
                "https://en.wikipedia.org/wiki/Eileen_MacDonagh" // wikipedia
        );

        Artist elizabethMagill = new Artist(
                35, // id
                "Elizabeth Magill", // name
                64, // age
                "1959-01-01", // birth
                null, // death
                "Elizabeth Magill is an Irish painter. She studied at the Belfast College of Art and the Slade School of Fine Art, and now lives and works in London.", // bio
                "Landscape", // style
                "https://en.wikipedia.org/wiki/Elizabeth_Magill" // wikipedia
        );

        Artist aliceMaher = new Artist(
                36, // id
                "Alice Maher", // name
                67, // age
                "1956-01-01", // birth
                null, // death
                "Alice Maher  is a contemporary Irish artist working in a variety of media, including sculpture, photography and installation.", // bio
                "Modern", // style
                "https://en.wikipedia.org/wiki/Alice_Maher" // wikipedia
        );

        Artist bryanMcCormack = new Artist(
                37, // id
                "Bryan McCormack", // name
                51, // age
                "1972-10-15", // birth
                null, // death
                "Bryan McCormack is a Contemporary artist who specifically deals with social subject matters. In the last fifteen years, Bryan Mc Cormack has had over 30 group and solo exhibitions. Currently he lives and works in Paris, France.", // bio
                "Instillation", // style
                "https://en.wikipedia.org/wiki/Bryan_McCormack" // wikipedia
        );

        Artist francisMcKee = new Artist(
                38, // id
                "Francis McKee", // name
                63, // age
                "1960-01-01", // birth
                null, // death
                "Francis McKee is an Irish writer and curator working in Glasgow.", // bio
                "Curation", // style
                "https://en.wikipedia.org/wiki/Francis_McKee" // wikipedia
        );

        Artist richardMosse = new Artist(
                39, // id
                "Richard Mosse", // name
                43, // age
                "1980-01-01", // birth
                null, // death
                "Richard Mosse is an Irish conceptual documentary photographer, living in New York City and Ireland.", // bio
                "Contemporary", // style
                "https://en.wikipedia.org/wiki/Richard_Mosse" // wikipedia
        );

        Artist janetMullarney = new Artist(
                40, // id
                "Janet Mullarney", // name
                68, // age
                "1952-03-15", // birth
                "2020-04-03", // death
                "Janet Mullarney was an Irish artist and Sculptor", // bio
                "Sculpture", // style
                "https://en.wikipedia.org/wiki/Janet_Mullarney" // wikipedia
        );

        Artist isabelNolan = new Artist(
                41, // id
                "Isabel Nolan", // name
                48, // age
                "1974-01-01", // birth
                null, // death
                "Isabel Nolan is an Irish contemporary artist who works with sculpture, textile, photographs, and text. Nolan lives and works in Dublin.", // bio
                "Sculpture", // style
                "https://en.wikipedia.org/wiki/Isabel_Nolan" // wikipedia
        );

        Artist abigailOBrien = new Artist(
                42, // id
                "Abigail O'Brien", // name
                65, // age
                "1957-01-01", // birth
                null, // death
                "Abigail O'Brien is a contemporary Irish artist and the first female president of the Royal Hibernian Academy since its establishment in 1823.", // bio
                "Multi-media", // style
                "https://en.wikipedia.org/wiki/Abigail_O%27Brien" // wikipedia
        );

        Artist eilisOConnell = new Artist(
                43, // id
                "Eilis O'Connell", // name
                70, // age
                "1953-01-01", // birth
                null, // death
                "Eilis O'Connell is an abstract sculptor. She is known for her free-standing works and wall pieces", // bio
                "Sculpture", // style
                "https://en.wikipedia.org/wiki/Eilis_O%27Connell" // wikipedia
        );

        Artist alisonPilkington = new Artist(
                44, // id
                "Alison Pilkington", // name
                56, // age
                "1967-01-01", // birth
                null, // death
                "Alison Pilkington is an Irish artist. She graduated with a Diploma in Fine Art Painting and Printmaking from Sligo RTC in 1989 and with a BA Hons in Fine Art Painting from The National College of Art and Design, Dublin in 1990.", // bio
                "Contemporary", // style
                "https://en.wikipedia.org/wiki/Alison_Pilkington" // wikipedia
        );

        Artist kathyPrendergast = new Artist(
                45, // id
                "Kathy Prendergast", // name
                65, // age
                "1958-01-01", // birth
                null, // death
                "Kathy Prendergast  is an Irish sculptor, draftsman, and painter.", // bio
                "Sculpture", // style
                "https://en.wikipedia.org/wiki/Kathy_Prendergast" // wikipedia
        );

        Artist davidQuinn = new Artist(
                46, // id
                "David Quinn", // name
                52, // age
                "1971-01-01", // birth
                null, // death
                "David Quinn (born 1971 in Dublin) is a painter and contemporary Irish artist.", // bio
                "Contemporary", // style
                "https://en.wikipedia.org/wiki/David_Quinn_(visual_artist)" // wikipedia
        );

        Artist peterRichards = new Artist(
                47, // id
                "Peter Richards", // name
                53, // age
                "1970-01-01", // birth
                null, // death
                "Peter Richards is a Welsh-born Irish artist and curator. Early in his career he worked primarily on video art and installations, later also working in performance art. Richards is living and working in Belfast, Northern Ireland, since 1994.", // bio
                "Curation", // style
                "https://en.wikipedia.org/wiki/Peter_Richards_(artist)" // wikipedia
        );

        Artist evaRothschild = new Artist(
                48, // id
                "Eva Rothschild", // name
                52, // age
                "1971-01-01", // birth
                null, // death
                "Eva Rothschild was born in Dublin, Ireland. She received a BA in Fine Art from the University of Ulster, Belfast (1990–93), and an MA in Fine Art from Goldsmiths College, London (1997–99).", // bio
                "Sculpture", // style
                "https://en.wikipedia.org/wiki/Eva_Rothschild" // wikipedia
        );

        Artist seanScully = new Artist(
                49, // id
                "Sean Scully", // name
                77, // age
                "1945-06-30", // birth
                null, // death
                "Sean Scully  is an Irish-born American-based artist working as a painter, printmaker, sculptor and photographer. His work is held in museum collections worldwide and he has twice been named a Turner Prize nominee.", // bio
                "Sculpture", // style
                "https://en.wikipedia.org/wiki/Sean_Scully" // wikipedia
        );

        Artist johnShinnors = new Artist(
                50, // id
                "John Shinnors", // name
                73, // age
                "1950-04-14", // birth
                null, // death
                "John Shinnors is an Irish landscape artist whose work has become increasingly abstract over time. He is a member of Aosdána and sits as the visual arts representative on EV+A.", // bio
                "Landscape", // style
                "https://en.wikipedia.org/wiki/John_Shinnors" // wikipedia
        );

        Artist victorSloan = new Artist(
                51, // id
                "Victor Sloan", // name
                77, // age
                "1945-01-01", // birth
                null, // death
                "Victor Sloan is a Northern Irish photographer and artist.", // bio
                "Photography", // style
                "https://en.wikipedia.org/wiki/Victor_Sloan" // wikipedia
        );

        Artist andreStitt = new Artist(
                52, // id
                "Andre Stitt", // name
                65, // age
                "1958-01-01", // birth
                null, // death
                "André Stitt is an artist currently based in Cardiff, Wales, where he is a Professor of Fine Art at the Cardiff School of Art & Design.", // bio
                "Contemporary", // style
                "https://en.wikipedia.org/wiki/Andre_Stitt" // wikipedia
        );

        artists.addAll(artists);
    }
}
