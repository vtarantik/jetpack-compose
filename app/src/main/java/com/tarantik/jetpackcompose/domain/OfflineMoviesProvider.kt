package com.tarantik.jetpackcompose.domain

import com.tarantik.jetpackcompose.domain.model.Genre
import com.tarantik.jetpackcompose.domain.model.Movie
import com.tarantik.jetpackcompose.domain.model.MovieDetail
import com.tarantik.jetpackcompose.domain.model.ProductionCompany
import com.tarantik.jetpackcompose.domain.model.ProductionCountry
import com.tarantik.jetpackcompose.domain.model.SpokenLanguage
import com.tarantik.jetpackcompose.domain.model.Trailer
import com.tarantik.jetpackcompose.domain.model.Collection

object OfflineMoviesProvider {
    fun getMovies(): List<Movie> {
        return listOf(
            Movie(
                id = 640146,
                posterPath = "/qnqGbB22YJ7dSs4o6M7exTpNxPz.jpg",
                adult = false,
                overview = "Super-Hero partners Scott Lang and Hope van Dyne, along with with Hope's parents Janet van Dyne and Hank Pym, and Scott's daughter Cassie Lang, find themselves exploring the Quantum Realm, interacting with strange new creatures and embarking on an adventure that will push them beyond the limits of what they thought possible.",
                releaseDate = "2023-02-15",
                genreIds = listOf(28, 12, 878),
                originalTitle = "Ant-Man and the Wasp: Quantumania",
                originalLanguage = "en",
                title = "Ant-Man and the Wasp: Quantumania",
                backdropPath = "/3CxUndGhUcZdt1Zggjdb2HkLLQX.jpg",
                popularity = 3783.0,
                voteCount = 2346,
                video = false,
                voteAverage = 6.6
            ),
            Movie(
                adult = false,
                backdropPath = "/hiHGRbyTcbZoLsYYkO4QiCLYe34.jpg",
                genreIds = listOf(27, 9648, 53),
                id = 758323,
                originalLanguage = "en",
                originalTitle = "The Pope's Exorcist",
                overview = "Father Gabriele Amorth, Chief Exorcist of the Vatican, investigates a young boy's terrifying possession and ends up uncovering a centuries-old conspiracy the Vatican has desperately tried to keep hidden.",
                popularity = 3591.591,
                posterPath = "/9JBEPLTPSm0d1mbEcLxULjJq9Eh.jpg",
                releaseDate = "2023-04-05",
                title = "The Pope's Exorcist",
                video = false,
                voteAverage = 7.4,
                voteCount = 717
            ),
            Movie(
                adult = false,
                backdropPath = "/iJQIbOPm81fPEGKt5BPuZmfnA54.jpg",
                genreIds = listOf(16, 12, 10751, 14, 35),
                id = 502356,
                originalLanguage = "en",
                originalTitle = "The Super Mario Bros. Movie",
                overview = "While working underground to fix a water main, Brooklyn plumbers—and brothers—Mario and Luigi are transported down a mysterious pipe and wander into a magical new world. But when the brothers are separated, Mario embarks on an epic quest to find Luigi.",
                popularity = 3014.97,
                posterPath = "/qNBAXBIQlnOThrVvA6mA2B5ggV6.jpg",
                releaseDate = "2023-04-05",
                title = "The Super Mario Bros. Movie",
                video = false,
                voteAverage = 7.5,
                voteCount = 1901
            ),
            Movie(
                adult = false,
                backdropPath = "/A7JQ7MIV5fkIxceI5hizRIe6DRJ.jpg",
                genreIds = listOf(878, 12, 28),
                id = 447365,
                originalLanguage = "en",
                originalTitle = "Guardians of the Galaxy Vol. 3",
                overview = "Peter Quill, still reeling from the loss of Gamora, must rally his team around him to defend the universe along with protecting one of their own. A mission that, if not completed successfully, could quite possibly lead to the end of the Guardians as we know them.",
                popularity = 2289.741,
                posterPath = "/r2J02Z2OpNTctfOSN1Ydgii51I3.jpg",
                releaseDate = "2023-05-03",
                title = "Guardians of the Galaxy Vol. 3",
                video = false,
                voteAverage = 8.3,
                voteCount = 814
            ),
            Movie(
                adult = false,
                backdropPath = "/aAgGrfBwna1nO4M2USxwFgK5O0t.jpg",
                genreIds = listOf(27, 53),
                id = 713704,
                originalLanguage = "en",
                originalTitle = "Evil Dead Rise",
                overview = "Two sisters find an ancient vinyl that gives birth to bloodthirsty demons that run amok in a Los Angeles apartment building and thrusts them into a primal battle for survival as they face the most nightmarish version of family imaginable.",
                popularity = 2170.816,
                posterPath = "/5ik4ATKmNtmJU6AYD0bLm56BCVM.jpg",
                releaseDate = "2023-04-12",
                title = "Evil Dead Rise",
                video = false,
                voteAverage = 7.2,
                voteCount = 593
            ),
            Movie(
                adult = false,
                backdropPath = "/b9UCfDzwiWw7mIFsIQR9ZJUeh7q.jpg",
                genreIds = listOf(28, 35, 10749),
                id = 868759,
                originalLanguage = "en",
                originalTitle = "Ghosted",
                overview = "Salt-of-the-earth Cole falls head over heels for enigmatic Sadie — but then makes the shocking discovery that she’s a secret agent. Before they can decide on a second date, Cole and Sadie are swept away on an international adventure to save the world.",
                popularity = 2155.966,
                posterPath = "/liLN69YgoovHVgmlHJ876PKi5Yi.jpg",
                releaseDate = "2023-04-18",
                title = "Ghosted",
                video = false,
                voteAverage = 7.1,
                voteCount = 685
            ),
            Movie(
                adult = false,
                backdropPath = "/nDxJJyA5giRhXx96q1sWbOUjMBI.jpg",
                genreIds = listOf(28, 35, 14, 12),
                id = 594767,
                originalLanguage = "en",
                originalTitle = "Shazam! Fury of the Gods",
                overview = "Billy Batson and his foster siblings, who transform into superheroes by saying \"Shazam!\", are forced to get back into action and fight the Daughters of Atlas, who they must stop from using a weapon that could destroy the world.",
                popularity = 2142.088,
                posterPath = "/2VK4d3mqqTc7LVZLnLPeRiPaJ71.jpg",
                releaseDate = "2023-03-15",
                title = "Shazam! Fury of the Gods",
                video = false,
                voteAverage = 6.8,
                voteCount = 1532
            ),
            Movie(
                adult = false,
                backdropPath = "/zPEDfWece7gg1I0904KFFVUq5mg.jpg",
                genreIds = listOf(53, 28, 80),
                id = 1102776,
                originalLanguage = "fr",
                originalTitle = "AKA",
                overview = "A steely special ops agent finds his morality put to the test when he infiltrates a crime syndicate and unexpectedly bonds with the boss' young son.",
                popularity = 2125.161,
                posterPath = "/3BSxAjiporlwQTWzaHZ9Yrl5C9D.jpg",
                releaseDate = "2023-04-28",
                title = "AKA",
                video = false,
                voteAverage = 7.1,
                voteCount = 172
            ),
            Movie(
                adult = false,
                backdropPath = "/8rpDcsfLJypbO6vREc0547VKqEv.jpg",
                genreIds = listOf(878, 12, 28),
                id = 76600,
                originalLanguage = "en",
                originalTitle = "Avatar: The Way of Water",
                overview = "Set more than a decade after the events of the first film, learn the story of the Sully family (Jake, Neytiri, and their kids), the trouble that follows them, the lengths they go to keep each other safe, the battles they fight to stay alive, and the tragedies they endure.",
                popularity = 1903.465,
                posterPath = "/t6HIqrRAclMCA60NsSmeqe9RmNV.jpg",
                releaseDate = "2022-12-14",
                title = "Avatar: The Way of Water",
                video = false,
                voteAverage = 7.7,
                voteCount = 7893
            ),
            Movie(
                adult = false,
                backdropPath = "/5i6SjyDbDWqyun8klUuCxrlFbyw.jpg",
                genreIds = listOf(18, 28),
                id = 677179,
                originalLanguage = "en",
                originalTitle = "Creed III",
                overview = "After dominating the boxing world, Adonis Creed has been thriving in both his career and family life. When a childhood friend and former boxing prodigy, Damian Anderson, resurfaces after serving a long sentence in prison, he is eager to prove that he deserves his shot in the ring. The face-off between former friends is more than just a fight. To settle the score, Adonis must put his future on the line to battle Damian — a fighter who has nothing to lose.",
                popularity = 1515.903,
                posterPath = "/cvsXj3I9Q2iyyIo95AecSd1tad7.jpg",
                releaseDate = "2023-03-01",
                title = "Creed III",
                video = false,
                voteAverage = 7.3,
                voteCount = 1313
            ),
            Movie(
                adult = false,
                backdropPath = "/44immBwzhDVyjn87b3x3l9mlhAD.jpg",
                genreIds = listOf(27, 9648, 53),
                id = 934433,
                originalLanguage = "en",
                originalTitle = "Scream VI",
                overview = "Following the latest Ghostface killings, the four survivors leave Woodsboro behind and start a fresh chapter.",
                popularity = 1324.071,
                posterPath = "/wDWwtvkRRlgTiUr6TyLSMX8FCuZ.jpg",
                releaseDate = "2023-03-08",
                title = "Scream VI",
                video = false,
                voteAverage = 7.3,
                voteCount = 1069
            ),
            Movie(
                adult = false,
                backdropPath = "/xwA90BwZXTh8ke3CVsQlj8EOkFr.jpg",
                genreIds = listOf(28, 12, 36, 18, 10752),
                id = 948713,
                originalLanguage = "en",
                originalTitle = "The Last Kingdom: Seven Kings Must Die",
                overview = "In the wake of King Edward's death, Uhtred of Bebbanburg and his comrades adventure across a fractured kingdom in the hopes of uniting England at last.",
                popularity = 1150.44,
                posterPath = "/7yyFEsuaLGTPul5UkHc5BhXnQ0k.jpg",
                releaseDate = "2023-04-14",
                title = "The Last Kingdom: Seven Kings Must Die",
                video = false,
                voteAverage = 7.3,
                voteCount = 325
            ),
            Movie(
                adult = false,
                backdropPath = "/20uHjZ4yCPD2x0ndcxZaxM7hLIy.jpg",
                genreIds = listOf(12, 14, 35),
                id = 493529,
                originalLanguage = "en",
                originalTitle = "Dungeons & Dragons: Honor Among Thieves",
                overview = "A charming thief and a band of unlikely adventurers undertake an epic heist to retrieve a lost relic, but things go dangerously awry when they run afoul of the wrong people.",
                popularity = 1094.948,
                posterPath = "/v7UF7ypAqjsFZFdjksjQ7IUpXdn.jpg",
                releaseDate = "2023-03-23",
                title = "Dungeons & Dragons: Honor Among Thieves",
                video = false,
                voteAverage = 7.5,
                voteCount = 1027
            ),
            Movie(
                adult = false,
                backdropPath = "/8HfjrSxfTVKmjNh8cJjbu5eXzcX.jpg",
                genreIds = listOf(10751, 14, 28, 12),
                id = 420808,
                originalLanguage = "en",
                originalTitle = "Peter Pan & Wendy",
                overview = "Wendy Darling, a young girl afraid to leave her childhood home behind, meets Peter Pan, a boy who refuses to grow up. Alongside her brothers and a tiny fairy, Tinker Bell, she travels with Peter to the magical world of Neverland. There, she encounters an evil pirate captain, Captain Hook, and embarks on a thrilling adventure that will change her life forever.",
                popularity = 1057.785,
                posterPath = "/9NXAlFEE7WDssbXSMgdacsUD58Y.jpg",
                releaseDate = "2023-04-20",
                title = "Peter Pan & Wendy",
                video = false,
                voteAverage = 5.9,
                voteCount = 292
            ),
            Movie(
                adult = false,
                backdropPath = "/h8gHn0OzBoaefsYseUByqsmEDMY.jpg",
                genreIds = listOf(28, 53, 80),
                id = 603692,
                originalLanguage = "en",
                originalTitle = "John Wick: Chapter 4",
                overview = "With the price on his head ever increasing, John Wick uncovers a path to defeating The High Table. But before he can earn his freedom, Wick must face off against a new enemy with powerful alliances across the globe and forces that turn old friends into foes.",
                popularity = 1000.309,
                posterPath = "/vZloFAK7NmvMGKE7VkF5UHaz0I.jpg",
                releaseDate = "2023-03-22",
                title = "John Wick: Chapter 4",
                video = false,
                voteAverage = 7.9,
                voteCount = 1354
            ),
            Movie(
                adult = false,
                backdropPath = "/jr8tSoJGj33XLgFBy6lmZhpGQNu.jpg",
                genreIds = listOf(16, 10751, 14, 12, 35, 18),
                id = 315162,
                originalLanguage = "en",
                originalTitle = "Puss in Boots: The Last Wish",
                overview = "Puss in Boots discovers that his passion for adventure has taken its toll: He has burned through eight of his nine lives, leaving him with only one life left. Puss sets out on an epic journey to find the mythical Last Wish and restore his nine lives.",
                popularity = 822.171,
                posterPath = "/kuf6dutpsT0vSVehic3EZIqkOBt.jpg",
                releaseDate = "2022-12-07",
                title = "Puss in Boots: The Last Wish",
                video = false,
                voteAverage = 8.3,
                voteCount = 5468
            ),
            Movie(
                adult = false,
                backdropPath = "/bT3IpP7OopgiVuy6HCPOWLuaFAd.jpg",
                genreIds = listOf(35, 80),
                id = 638974,
                originalLanguage = "en",
                originalTitle = "Murder Mystery 2",
                overview = "After starting their own detective agency, Nick and Audrey Spitz land a career-making case when their billionaire pal is kidnapped from his wedding.",
                popularity = 818.428,
                posterPath = "/s1VzVhXlqsevi8zeCMG9A16nEUf.jpg",
                releaseDate = "2023-03-28",
                title = "Murder Mystery 2",
                video = false,
                voteAverage = 6.6,
                voteCount = 985
            ),
            Movie(
                adult = false,
                backdropPath = "/fI5RsaM0NSU6TqztRhA2pal5ezv.jpg",
                genreIds = listOf(28, 80, 53),
                id = 385687,
                originalLanguage = "en",
                originalTitle = "Fast X",
                overview = "Over many missions and against impossible odds, Dom Toretto and his family have outsmarted, out-nerved and outdriven every foe in their path. Now, they confront the most lethal opponent they've ever faced: A terrifying threat emerging from the shadows of the past who's fueled by blood revenge, and who is determined to shatter this family and destroy everything—and everyone—that Dom loves, forever.",
                popularity = 765.615,
                posterPath = "/1E5baAaEse26fej7uHcjOgEE2t2.jpg",
                releaseDate = "2023-05-17",
                title = "Fast X",
                video = false,
                voteAverage = 0.0,
                voteCount = 0
            ),
            Movie(
                adult = false,
                backdropPath = "/bF2skCyB5jeJuO26GFaQIGHrMNl.jpg",
                genreIds = listOf(27, 9648, 53),
                id = 1085103,
                originalLanguage = "en",
                originalTitle = "Clock",
                overview = "On the eve of her 38th birthday, a woman desperately attempts to fix her broken biological clock.",
                popularity = 702.115,
                posterPath = "/m6Yt77C9u7Aume9dTJMCSRzWDED.jpg",
                releaseDate = "2023-03-28",
                title = "Clock",
                video = false,
                voteAverage = 5.9,
                voteCount = 59
            ),
            Movie(
                adult = false,
                backdropPath = "/cYyUinLXRbQwE4PAt2mQLTGBqti.jpg",
                genreIds = listOf(28, 53),
                id = 876969,
                originalLanguage = "en",
                originalTitle = "Assassin Club",
                overview = "In this world of contract killers, Morgan Gaines is the best of the best. When Morgan is hired to kill six people around the world, he soon discovers all the targets are also assassins unknowingly hired to kill each other.",
                popularity = 697.046,
                posterPath = "/y2d2SBqK33mGOG2CqAYMo3YbWE4.jpg",
                releaseDate = "2023-02-24",
                title = "Assassin Club",
                video = false,
                voteAverage = 7.1,
                voteCount = 35
            )
        )
    }

    fun getMovieDetail(movieId: Int): MovieDetail {
        return MovieDetail(
            adult = false,
            backdropPath = "/h8gHn0OzBoaefsYseUByqsmEDMY.jpg",
            belongsToCollection = Collection(
                id = 404609,
                name = "John Wick Collection",
                posterPath = "/xUidyvYFsbbuExifLkslpcd8SMc.jpg",
                backdropPath = "/fSwYa5q2xRkBoOOjueLpkLf3N1m.jpg",
                overview = null,
            ),
            budget = 90000000,
            genres = listOf(
                Genre(id = 28, name = "Action"),
                Genre(id = 53, name = "Thriller"),
                Genre(id = 80, name = "Crime")
            ),
            homepage = "https://johnwick.movie",
            id = 603692,
            imdbId = "tt10366206",
            originalLanguage = "en",
            originalTitle = "John Wick: Chapter 4",
            overview = "With the price on his head ever increasing, John Wick uncovers a path to defeating The High Table. But before he can earn his freedom, Wick must face off against a new enemy with powerful alliances across the globe and forces that turn old friends into foes.",
            popularity = 1000.309,
            posterPath = "/vZloFAK7NmvMGKE7VkF5UHaz0I.jpg",
            productionCompanies = listOf(
                ProductionCompany(
                    id = 3528,
                    logoPath = "/cCzCClIzIh81Fa79hpW5nXoUsHK.png",
                    name = "Thunder Road",
                    originCountry = "US"
                ),
                ProductionCompany(
                    id = 23008,
                    logoPath = "/5SarYupipdiejsEqUkwu1SpYfru.png",
                    name = "87Eleven",
                    originCountry = "US"
                ),
                ProductionCompany(
                    id = 491,
                    logoPath = "/rUp0lLKa1pr4UsPm8fgzmnNGxtq.png",
                    name = "Summit Entertainment",
                    originCountry = "US"
                ),
                ProductionCompany(
                    id = 264,
                    logoPath = "/fA90qwUKgPhMONqtwY60GaHRyrW.png",
                    name = "Studio Babelsberg",
                    originCountry = "DE"
                ),
                ProductionCompany(
                    id = 1632,
                    logoPath = "/cisLn1YAUuptXVBa0xjq7ST9cH0.png",
                    name = "Lionsgate",
                    originCountry = "US"
                )
            ),
            productionCountries = listOf(
                ProductionCountry(iso_3166_1 = "DE", name = "Germany"),
                ProductionCountry(iso_3166_1 = "US", name = "United States of America")
            ),
            releaseDate = "2023-03-22",
            revenue = 406056266,
            runtime = 170,
            status = "Released",
            tagline = "No way back. One way out.",
            title = "John Wick: Chapter 4",
            video = false,
            voteAverage = 7.9,
            voteCount = 1359,
            spokenLanguages = listOf(
                SpokenLanguage(
                    iso_639_1 = "cn",
                    name = "广州话 / 廣州話"
                ),
                SpokenLanguage(
                    iso_639_1 = "cn",
                    name = "广州话 / 廣州話"
                ),
                SpokenLanguage(
                    iso_639_1 = "fr",
                    name = "Français"
                ),
                SpokenLanguage(
                    iso_639_1 = "en",
                    name = "English"
                ),
                SpokenLanguage(
                    iso_639_1 = "es",
                    name = "Español"
                ),
                SpokenLanguage(
                    iso_639_1 = "it",
                    name = "Italiano"
                ),
                SpokenLanguage(
                    iso_639_1 = "ja",
                    name = "日本語"
                ),
                SpokenLanguage(
                    iso_639_1 = "la",
                    name = "Latin"
                ),
                SpokenLanguage(
                    iso_639_1 = "ru",
                    name = "Pусский"
                )
            )
        )
    }


    fun getTrailer(movieId: Int): Trailer {
        return Trailer(
            "en",
            "US",
            "Official Trailer",
            "JfVOs4VSpmA",
            "YouTube",
            1080,
            "Trailer",
            true,
            "2021-11-17T01:30:05.000Z",
            "61945b8a4da3d4002992d5a6"
        )
    }
}