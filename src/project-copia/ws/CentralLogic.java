
package project.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CentralLogic", targetNamespace = "http://ws.project/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CentralLogic {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(name = "string", targetNamespace = "")
    @RequestWrapper(localName = "initDB", targetNamespace = "http://ws.project/", className = "project.ws.InitDB")
    @ResponseWrapper(localName = "initDBResponse", targetNamespace = "http://ws.project/", className = "project.ws.InitDBResponse")
    @Action(input = "http://ws.project/CentralLogic/initDBRequest", output = "http://ws.project/CentralLogic/initDBResponse")
    public String initDB();

    /**
     * 
     * @param arg0
     * @return
     *     returns project.ws.User
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "getUser", targetNamespace = "http://ws.project/", className = "project.ws.GetUser")
    @ResponseWrapper(localName = "getUserResponse", targetNamespace = "http://ws.project/", className = "project.ws.GetUserResponse")
    @Action(input = "http://ws.project/CentralLogic/getUserRequest", output = "http://ws.project/CentralLogic/getUserResponse")
    public User getUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "int", targetNamespace = "")
    @RequestWrapper(localName = "deleteUser", targetNamespace = "http://ws.project/", className = "project.ws.DeleteUser")
    @ResponseWrapper(localName = "deleteUserResponse", targetNamespace = "http://ws.project/", className = "project.ws.DeleteUserResponse")
    @Action(input = "http://ws.project/CentralLogic/deleteUserRequest", output = "http://ws.project/CentralLogic/deleteUserResponse")
    public int deleteUser(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @return
     *     returns java.util.List<project.ws.User>
     */
    @WebMethod
    @WebResult(name = "users", targetNamespace = "")
    @RequestWrapper(localName = "getAllUser", targetNamespace = "http://ws.project/", className = "project.ws.GetAllUser")
    @ResponseWrapper(localName = "getAllUserResponse", targetNamespace = "http://ws.project/", className = "project.ws.GetAllUserResponse")
    @Action(input = "http://ws.project/CentralLogic/getAllUserRequest", output = "http://ws.project/CentralLogic/getAllUserResponse")
    public List<User> getAllUser();

    /**
     * 
     * @param arg0
     * @return
     *     returns project.ws.Artist
     */
    @WebMethod
    @WebResult(name = "artist", targetNamespace = "")
    @RequestWrapper(localName = "getArtist", targetNamespace = "http://ws.project/", className = "project.ws.GetArtist")
    @ResponseWrapper(localName = "getArtistResponse", targetNamespace = "http://ws.project/", className = "project.ws.GetArtistResponse")
    @Action(input = "http://ws.project/CentralLogic/getArtistRequest", output = "http://ws.project/CentralLogic/getArtistResponse")
    public Artist getArtist(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<project.ws.Artist>
     */
    @WebMethod
    @WebResult(name = "artists", targetNamespace = "")
    @RequestWrapper(localName = "getAllArtist", targetNamespace = "http://ws.project/", className = "project.ws.GetAllArtist")
    @ResponseWrapper(localName = "getAllArtistResponse", targetNamespace = "http://ws.project/", className = "project.ws.GetAllArtistResponse")
    @Action(input = "http://ws.project/CentralLogic/getAllArtistRequest", output = "http://ws.project/CentralLogic/getAllArtistResponse")
    public List<Artist> getAllArtist();

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "int", targetNamespace = "")
    @RequestWrapper(localName = "deleteArtist", targetNamespace = "http://ws.project/", className = "project.ws.DeleteArtist")
    @ResponseWrapper(localName = "deleteArtistResponse", targetNamespace = "http://ws.project/", className = "project.ws.DeleteArtistResponse")
    @Action(input = "http://ws.project/CentralLogic/deleteArtistRequest", output = "http://ws.project/CentralLogic/deleteArtistResponse")
    public int deleteArtist(
        @WebParam(name = "arg0", targetNamespace = "")
        Artist arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns project.ws.Song
     */
    @WebMethod
    @WebResult(name = "song", targetNamespace = "")
    @RequestWrapper(localName = "getSong", targetNamespace = "http://ws.project/", className = "project.ws.GetSong")
    @ResponseWrapper(localName = "getSongResponse", targetNamespace = "http://ws.project/", className = "project.ws.GetSongResponse")
    @Action(input = "http://ws.project/CentralLogic/getSongRequest", output = "http://ws.project/CentralLogic/getSongResponse")
    public Song getSong(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns java.util.List<project.ws.Song>
     */
    @WebMethod
    @WebResult(name = "songs", targetNamespace = "")
    @RequestWrapper(localName = "getAllSong", targetNamespace = "http://ws.project/", className = "project.ws.GetAllSong")
    @ResponseWrapper(localName = "getAllSongResponse", targetNamespace = "http://ws.project/", className = "project.ws.GetAllSongResponse")
    @Action(input = "http://ws.project/CentralLogic/getAllSongRequest", output = "http://ws.project/CentralLogic/getAllSongResponse")
    public List<Song> getAllSong();

    /**
     * 
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "int", targetNamespace = "")
    @RequestWrapper(localName = "deleteSong", targetNamespace = "http://ws.project/", className = "project.ws.DeleteSong")
    @ResponseWrapper(localName = "deleteSongResponse", targetNamespace = "http://ws.project/", className = "project.ws.DeleteSongResponse")
    @Action(input = "http://ws.project/CentralLogic/deleteSongRequest", output = "http://ws.project/CentralLogic/deleteSongResponse")
    public int deleteSong(
        @WebParam(name = "arg0", targetNamespace = "")
        Song arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "int", targetNamespace = "")
    @RequestWrapper(localName = "getUserLikeArtist", targetNamespace = "http://ws.project/", className = "project.ws.GetUserLikeArtist")
    @ResponseWrapper(localName = "getUserLikeArtistResponse", targetNamespace = "http://ws.project/", className = "project.ws.GetUserLikeArtistResponse")
    @Action(input = "http://ws.project/CentralLogic/getUserLikeArtistRequest", output = "http://ws.project/CentralLogic/getUserLikeArtistResponse")
    public int getUserLikeArtist(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Artist arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "int", targetNamespace = "")
    @RequestWrapper(localName = "getUserLikeSong", targetNamespace = "http://ws.project/", className = "project.ws.GetUserLikeSong")
    @ResponseWrapper(localName = "getUserLikeSongResponse", targetNamespace = "http://ws.project/", className = "project.ws.GetUserLikeSongResponse")
    @Action(input = "http://ws.project/CentralLogic/getUserLikeSongRequest", output = "http://ws.project/CentralLogic/getUserLikeSongResponse")
    public int getUserLikeSong(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Song arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "int", targetNamespace = "")
    @RequestWrapper(localName = "addRatingArtist", targetNamespace = "http://ws.project/", className = "project.ws.AddRatingArtist")
    @ResponseWrapper(localName = "addRatingArtistResponse", targetNamespace = "http://ws.project/", className = "project.ws.AddRatingArtistResponse")
    @Action(input = "http://ws.project/CentralLogic/addRatingArtistRequest", output = "http://ws.project/CentralLogic/addRatingArtistResponse")
    public int addRatingArtist(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Artist arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        boolean arg2);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "int", targetNamespace = "")
    @RequestWrapper(localName = "addRatingSong", targetNamespace = "http://ws.project/", className = "project.ws.AddRatingSong")
    @ResponseWrapper(localName = "addRatingSongResponse", targetNamespace = "http://ws.project/", className = "project.ws.AddRatingSongResponse")
    @Action(input = "http://ws.project/CentralLogic/addRatingSongRequest", output = "http://ws.project/CentralLogic/addRatingSongResponse")
    public int addRatingSong(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Song arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        boolean arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<project.ws.Song>
     */
    @WebMethod
    @WebResult(name = "songs", targetNamespace = "")
    @RequestWrapper(localName = "getSongsFromArtist", targetNamespace = "http://ws.project/", className = "project.ws.GetSongsFromArtist")
    @ResponseWrapper(localName = "getSongsFromArtistResponse", targetNamespace = "http://ws.project/", className = "project.ws.GetSongsFromArtistResponse")
    @Action(input = "http://ws.project/CentralLogic/getSongsFromArtistRequest", output = "http://ws.project/CentralLogic/getSongsFromArtistResponse")
    public List<Song> getSongsFromArtist(
        @WebParam(name = "arg0", targetNamespace = "")
        Artist arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<project.ws.Song>
     */
    @WebMethod
    @WebResult(name = "songs", targetNamespace = "")
    @RequestWrapper(localName = "getLikedSongs", targetNamespace = "http://ws.project/", className = "project.ws.GetLikedSongs")
    @ResponseWrapper(localName = "getLikedSongsResponse", targetNamespace = "http://ws.project/", className = "project.ws.GetLikedSongsResponse")
    @Action(input = "http://ws.project/CentralLogic/getLikedSongsRequest", output = "http://ws.project/CentralLogic/getLikedSongsResponse")
    public List<Song> getLikedSongs(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<project.ws.Song>
     */
    @WebMethod
    @WebResult(name = "songs", targetNamespace = "")
    @RequestWrapper(localName = "getDislikedSongs", targetNamespace = "http://ws.project/", className = "project.ws.GetDislikedSongs")
    @ResponseWrapper(localName = "getDislikedSongsResponse", targetNamespace = "http://ws.project/", className = "project.ws.GetDislikedSongsResponse")
    @Action(input = "http://ws.project/CentralLogic/getDislikedSongsRequest", output = "http://ws.project/CentralLogic/getDislikedSongsResponse")
    public List<Song> getDislikedSongs(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<project.ws.Artist>
     */
    @WebMethod
    @WebResult(name = "artists", targetNamespace = "")
    @RequestWrapper(localName = "getLikedArtists", targetNamespace = "http://ws.project/", className = "project.ws.GetLikedArtists")
    @ResponseWrapper(localName = "getLikedArtistsResponse", targetNamespace = "http://ws.project/", className = "project.ws.GetLikedArtistsResponse")
    @Action(input = "http://ws.project/CentralLogic/getLikedArtistsRequest", output = "http://ws.project/CentralLogic/getLikedArtistsResponse")
    public List<Artist> getLikedArtists(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<project.ws.Artist>
     */
    @WebMethod
    @WebResult(name = "artists", targetNamespace = "")
    @RequestWrapper(localName = "getDislikedArtists", targetNamespace = "http://ws.project/", className = "project.ws.GetDislikedArtists")
    @ResponseWrapper(localName = "getDislikedArtistsResponse", targetNamespace = "http://ws.project/", className = "project.ws.GetDislikedArtistsResponse")
    @Action(input = "http://ws.project/CentralLogic/getDislikedArtistsRequest", output = "http://ws.project/CentralLogic/getDislikedArtistsResponse")
    public List<Artist> getDislikedArtists(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "int", targetNamespace = "")
    @RequestWrapper(localName = "deleteUserLikeArtist", targetNamespace = "http://ws.project/", className = "project.ws.DeleteUserLikeArtist")
    @ResponseWrapper(localName = "deleteUserLikeArtistResponse", targetNamespace = "http://ws.project/", className = "project.ws.DeleteUserLikeArtistResponse")
    @Action(input = "http://ws.project/CentralLogic/deleteUserLikeArtistRequest", output = "http://ws.project/CentralLogic/deleteUserLikeArtistResponse")
    public int deleteUserLikeArtist(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Artist arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(name = "int", targetNamespace = "")
    @RequestWrapper(localName = "deleteUserLikeSong", targetNamespace = "http://ws.project/", className = "project.ws.DeleteUserLikeSong")
    @ResponseWrapper(localName = "deleteUserLikeSongResponse", targetNamespace = "http://ws.project/", className = "project.ws.DeleteUserLikeSongResponse")
    @Action(input = "http://ws.project/CentralLogic/deleteUserLikeSongRequest", output = "http://ws.project/CentralLogic/deleteUserLikeSongResponse")
    public int deleteUserLikeSong(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        Song arg1);

    /**
     * 
     * @return
     *     returns java.util.List<project.ws.Song>
     */
    @WebMethod
    @WebResult(name = "songs", targetNamespace = "")
    @RequestWrapper(localName = "initSongs", targetNamespace = "http://ws.project/", className = "project.ws.InitSongs")
    @ResponseWrapper(localName = "initSongsResponse", targetNamespace = "http://ws.project/", className = "project.ws.InitSongsResponse")
    @Action(input = "http://ws.project/CentralLogic/initSongsRequest", output = "http://ws.project/CentralLogic/initSongsResponse")
    public List<Song> initSongs();

    /**
     * 
     * @param arg0
     * @return
     *     returns java.util.List<project.ws.Song>
     */
    @WebMethod
    @WebResult(name = "songs", targetNamespace = "")
    @RequestWrapper(localName = "getRecommendation", targetNamespace = "http://ws.project/", className = "project.ws.GetRecommendation")
    @ResponseWrapper(localName = "getRecommendationResponse", targetNamespace = "http://ws.project/", className = "project.ws.GetRecommendationResponse")
    @Action(input = "http://ws.project/CentralLogic/getRecommendationRequest", output = "http://ws.project/CentralLogic/getRecommendationResponse")
    public List<Song> getRecommendation(
        @WebParam(name = "arg0", targetNamespace = "")
        User arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns project.ws.User
     */
    @WebMethod
    @WebResult(name = "user", targetNamespace = "")
    @RequestWrapper(localName = "createUser", targetNamespace = "http://ws.project/", className = "project.ws.CreateUser")
    @ResponseWrapper(localName = "createUserResponse", targetNamespace = "http://ws.project/", className = "project.ws.CreateUserResponse")
    @Action(input = "http://ws.project/CentralLogic/createUserRequest", output = "http://ws.project/CentralLogic/createUserResponse")
    public User createUser(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

}