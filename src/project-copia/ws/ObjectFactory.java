
package project.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the project.ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetUserLikeArtistResponse_QNAME = new QName("http://ws.project/", "getUserLikeArtistResponse");
    private final static QName _GetArtist_QNAME = new QName("http://ws.project/", "getArtist");
    private final static QName _GetRecommendation_QNAME = new QName("http://ws.project/", "getRecommendation");
    private final static QName _GetUserLikeArtist_QNAME = new QName("http://ws.project/", "getUserLikeArtist");
    private final static QName _CreateUserResponse_QNAME = new QName("http://ws.project/", "createUserResponse");
    private final static QName _DeleteUserLikeArtist_QNAME = new QName("http://ws.project/", "deleteUserLikeArtist");
    private final static QName _InitDB_QNAME = new QName("http://ws.project/", "initDB");
    private final static QName _AddRatingArtist_QNAME = new QName("http://ws.project/", "addRatingArtist");
    private final static QName _GetAllUserResponse_QNAME = new QName("http://ws.project/", "getAllUserResponse");
    private final static QName _AddRatingSongResponse_QNAME = new QName("http://ws.project/", "addRatingSongResponse");
    private final static QName _GetLikedSongs_QNAME = new QName("http://ws.project/", "getLikedSongs");
    private final static QName _DeleteSongResponse_QNAME = new QName("http://ws.project/", "deleteSongResponse");
    private final static QName _InitSongs_QNAME = new QName("http://ws.project/", "initSongs");
    private final static QName _DeleteArtist_QNAME = new QName("http://ws.project/", "deleteArtist");
    private final static QName _GetAllArtist_QNAME = new QName("http://ws.project/", "getAllArtist");
    private final static QName _DeleteUserResponse_QNAME = new QName("http://ws.project/", "deleteUserResponse");
    private final static QName _GetSongResponse_QNAME = new QName("http://ws.project/", "getSongResponse");
    private final static QName _GetLikedArtists_QNAME = new QName("http://ws.project/", "getLikedArtists");
    private final static QName _CreateUser_QNAME = new QName("http://ws.project/", "createUser");
    private final static QName _GetDislikedSongs_QNAME = new QName("http://ws.project/", "getDislikedSongs");
    private final static QName _DeleteUser_QNAME = new QName("http://ws.project/", "deleteUser");
    private final static QName _GetAllUser_QNAME = new QName("http://ws.project/", "getAllUser");
    private final static QName _GetAllSongResponse_QNAME = new QName("http://ws.project/", "getAllSongResponse");
    private final static QName _GetSongsFromArtist_QNAME = new QName("http://ws.project/", "getSongsFromArtist");
    private final static QName _GetUser_QNAME = new QName("http://ws.project/", "getUser");
    private final static QName _GetRecommendationResponse_QNAME = new QName("http://ws.project/", "getRecommendationResponse");
    private final static QName _GetSongsFromArtistResponse_QNAME = new QName("http://ws.project/", "getSongsFromArtistResponse");
    private final static QName _DeleteArtistResponse_QNAME = new QName("http://ws.project/", "deleteArtistResponse");
    private final static QName _GetLikedArtistsResponse_QNAME = new QName("http://ws.project/", "getLikedArtistsResponse");
    private final static QName _AddRatingSong_QNAME = new QName("http://ws.project/", "addRatingSong");
    private final static QName _GetAllArtistResponse_QNAME = new QName("http://ws.project/", "getAllArtistResponse");
    private final static QName _GetDislikedArtistsResponse_QNAME = new QName("http://ws.project/", "getDislikedArtistsResponse");
    private final static QName _GetUserResponse_QNAME = new QName("http://ws.project/", "getUserResponse");
    private final static QName _DeleteUserLikeSong_QNAME = new QName("http://ws.project/", "deleteUserLikeSong");
    private final static QName _GetAllSong_QNAME = new QName("http://ws.project/", "getAllSong");
    private final static QName _GetSong_QNAME = new QName("http://ws.project/", "getSong");
    private final static QName _DeleteSong_QNAME = new QName("http://ws.project/", "deleteSong");
    private final static QName _GetUserLikeSong_QNAME = new QName("http://ws.project/", "getUserLikeSong");
    private final static QName _GetArtistResponse_QNAME = new QName("http://ws.project/", "getArtistResponse");
    private final static QName _GetLikedSongsResponse_QNAME = new QName("http://ws.project/", "getLikedSongsResponse");
    private final static QName _AddRatingArtistResponse_QNAME = new QName("http://ws.project/", "addRatingArtistResponse");
    private final static QName _InitSongsResponse_QNAME = new QName("http://ws.project/", "initSongsResponse");
    private final static QName _GetDislikedArtists_QNAME = new QName("http://ws.project/", "getDislikedArtists");
    private final static QName _GetUserLikeSongResponse_QNAME = new QName("http://ws.project/", "getUserLikeSongResponse");
    private final static QName _InitDBResponse_QNAME = new QName("http://ws.project/", "initDBResponse");
    private final static QName _DeleteUserLikeArtistResponse_QNAME = new QName("http://ws.project/", "deleteUserLikeArtistResponse");
    private final static QName _DeleteUserLikeSongResponse_QNAME = new QName("http://ws.project/", "deleteUserLikeSongResponse");
    private final static QName _GetDislikedSongsResponse_QNAME = new QName("http://ws.project/", "getDislikedSongsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: project.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddRatingSong }
     * 
     */
    public AddRatingSong createAddRatingSong() {
        return new AddRatingSong();
    }

    /**
     * Create an instance of {@link GetAllArtistResponse }
     * 
     */
    public GetAllArtistResponse createGetAllArtistResponse() {
        return new GetAllArtistResponse();
    }

    /**
     * Create an instance of {@link GetDislikedArtistsResponse }
     * 
     */
    public GetDislikedArtistsResponse createGetDislikedArtistsResponse() {
        return new GetDislikedArtistsResponse();
    }

    /**
     * Create an instance of {@link GetUserResponse }
     * 
     */
    public GetUserResponse createGetUserResponse() {
        return new GetUserResponse();
    }

    /**
     * Create an instance of {@link DeleteArtistResponse }
     * 
     */
    public DeleteArtistResponse createDeleteArtistResponse() {
        return new DeleteArtistResponse();
    }

    /**
     * Create an instance of {@link GetLikedArtistsResponse }
     * 
     */
    public GetLikedArtistsResponse createGetLikedArtistsResponse() {
        return new GetLikedArtistsResponse();
    }

    /**
     * Create an instance of {@link GetRecommendationResponse }
     * 
     */
    public GetRecommendationResponse createGetRecommendationResponse() {
        return new GetRecommendationResponse();
    }

    /**
     * Create an instance of {@link GetSongsFromArtistResponse }
     * 
     */
    public GetSongsFromArtistResponse createGetSongsFromArtistResponse() {
        return new GetSongsFromArtistResponse();
    }

    /**
     * Create an instance of {@link GetAllSongResponse }
     * 
     */
    public GetAllSongResponse createGetAllSongResponse() {
        return new GetAllSongResponse();
    }

    /**
     * Create an instance of {@link GetSongsFromArtist }
     * 
     */
    public GetSongsFromArtist createGetSongsFromArtist() {
        return new GetSongsFromArtist();
    }

    /**
     * Create an instance of {@link GetUser }
     * 
     */
    public GetUser createGetUser() {
        return new GetUser();
    }

    /**
     * Create an instance of {@link GetArtistResponse }
     * 
     */
    public GetArtistResponse createGetArtistResponse() {
        return new GetArtistResponse();
    }

    /**
     * Create an instance of {@link GetLikedSongsResponse }
     * 
     */
    public GetLikedSongsResponse createGetLikedSongsResponse() {
        return new GetLikedSongsResponse();
    }

    /**
     * Create an instance of {@link GetUserLikeSong }
     * 
     */
    public GetUserLikeSong createGetUserLikeSong() {
        return new GetUserLikeSong();
    }

    /**
     * Create an instance of {@link DeleteSong }
     * 
     */
    public DeleteSong createDeleteSong() {
        return new DeleteSong();
    }

    /**
     * Create an instance of {@link DeleteUserLikeSong }
     * 
     */
    public DeleteUserLikeSong createDeleteUserLikeSong() {
        return new DeleteUserLikeSong();
    }

    /**
     * Create an instance of {@link GetAllSong }
     * 
     */
    public GetAllSong createGetAllSong() {
        return new GetAllSong();
    }

    /**
     * Create an instance of {@link GetSong }
     * 
     */
    public GetSong createGetSong() {
        return new GetSong();
    }

    /**
     * Create an instance of {@link DeleteUserLikeSongResponse }
     * 
     */
    public DeleteUserLikeSongResponse createDeleteUserLikeSongResponse() {
        return new DeleteUserLikeSongResponse();
    }

    /**
     * Create an instance of {@link GetDislikedSongsResponse }
     * 
     */
    public GetDislikedSongsResponse createGetDislikedSongsResponse() {
        return new GetDislikedSongsResponse();
    }

    /**
     * Create an instance of {@link DeleteUserLikeArtistResponse }
     * 
     */
    public DeleteUserLikeArtistResponse createDeleteUserLikeArtistResponse() {
        return new DeleteUserLikeArtistResponse();
    }

    /**
     * Create an instance of {@link GetDislikedArtists }
     * 
     */
    public GetDislikedArtists createGetDislikedArtists() {
        return new GetDislikedArtists();
    }

    /**
     * Create an instance of {@link GetUserLikeSongResponse }
     * 
     */
    public GetUserLikeSongResponse createGetUserLikeSongResponse() {
        return new GetUserLikeSongResponse();
    }

    /**
     * Create an instance of {@link InitDBResponse }
     * 
     */
    public InitDBResponse createInitDBResponse() {
        return new InitDBResponse();
    }

    /**
     * Create an instance of {@link AddRatingArtistResponse }
     * 
     */
    public AddRatingArtistResponse createAddRatingArtistResponse() {
        return new AddRatingArtistResponse();
    }

    /**
     * Create an instance of {@link InitSongsResponse }
     * 
     */
    public InitSongsResponse createInitSongsResponse() {
        return new InitSongsResponse();
    }

    /**
     * Create an instance of {@link InitDB }
     * 
     */
    public InitDB createInitDB() {
        return new InitDB();
    }

    /**
     * Create an instance of {@link AddRatingArtist }
     * 
     */
    public AddRatingArtist createAddRatingArtist() {
        return new AddRatingArtist();
    }

    /**
     * Create an instance of {@link CreateUserResponse }
     * 
     */
    public CreateUserResponse createCreateUserResponse() {
        return new CreateUserResponse();
    }

    /**
     * Create an instance of {@link DeleteUserLikeArtist }
     * 
     */
    public DeleteUserLikeArtist createDeleteUserLikeArtist() {
        return new DeleteUserLikeArtist();
    }

    /**
     * Create an instance of {@link GetUserLikeArtistResponse }
     * 
     */
    public GetUserLikeArtistResponse createGetUserLikeArtistResponse() {
        return new GetUserLikeArtistResponse();
    }

    /**
     * Create an instance of {@link GetArtist }
     * 
     */
    public GetArtist createGetArtist() {
        return new GetArtist();
    }

    /**
     * Create an instance of {@link GetRecommendation }
     * 
     */
    public GetRecommendation createGetRecommendation() {
        return new GetRecommendation();
    }

    /**
     * Create an instance of {@link GetUserLikeArtist }
     * 
     */
    public GetUserLikeArtist createGetUserLikeArtist() {
        return new GetUserLikeArtist();
    }

    /**
     * Create an instance of {@link AddRatingSongResponse }
     * 
     */
    public AddRatingSongResponse createAddRatingSongResponse() {
        return new AddRatingSongResponse();
    }

    /**
     * Create an instance of {@link GetLikedSongs }
     * 
     */
    public GetLikedSongs createGetLikedSongs() {
        return new GetLikedSongs();
    }

    /**
     * Create an instance of {@link GetAllUserResponse }
     * 
     */
    public GetAllUserResponse createGetAllUserResponse() {
        return new GetAllUserResponse();
    }

    /**
     * Create an instance of {@link GetAllArtist }
     * 
     */
    public GetAllArtist createGetAllArtist() {
        return new GetAllArtist();
    }

    /**
     * Create an instance of {@link DeleteArtist }
     * 
     */
    public DeleteArtist createDeleteArtist() {
        return new DeleteArtist();
    }

    /**
     * Create an instance of {@link DeleteSongResponse }
     * 
     */
    public DeleteSongResponse createDeleteSongResponse() {
        return new DeleteSongResponse();
    }

    /**
     * Create an instance of {@link InitSongs }
     * 
     */
    public InitSongs createInitSongs() {
        return new InitSongs();
    }

    /**
     * Create an instance of {@link DeleteUser }
     * 
     */
    public DeleteUser createDeleteUser() {
        return new DeleteUser();
    }

    /**
     * Create an instance of {@link GetAllUser }
     * 
     */
    public GetAllUser createGetAllUser() {
        return new GetAllUser();
    }

    /**
     * Create an instance of {@link CreateUser }
     * 
     */
    public CreateUser createCreateUser() {
        return new CreateUser();
    }

    /**
     * Create an instance of {@link GetDislikedSongs }
     * 
     */
    public GetDislikedSongs createGetDislikedSongs() {
        return new GetDislikedSongs();
    }

    /**
     * Create an instance of {@link DeleteUserResponse }
     * 
     */
    public DeleteUserResponse createDeleteUserResponse() {
        return new DeleteUserResponse();
    }

    /**
     * Create an instance of {@link GetSongResponse }
     * 
     */
    public GetSongResponse createGetSongResponse() {
        return new GetSongResponse();
    }

    /**
     * Create an instance of {@link GetLikedArtists }
     * 
     */
    public GetLikedArtists createGetLikedArtists() {
        return new GetLikedArtists();
    }

    /**
     * Create an instance of {@link UserLikes }
     * 
     */
    public UserLikes createUserLikes() {
        return new UserLikes();
    }

    /**
     * Create an instance of {@link Song }
     * 
     */
    public Song createSong() {
        return new Song();
    }

    /**
     * Create an instance of {@link Artist }
     * 
     */
    public Artist createArtist() {
        return new Artist();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserLikeArtistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getUserLikeArtistResponse")
    public JAXBElement<GetUserLikeArtistResponse> createGetUserLikeArtistResponse(GetUserLikeArtistResponse value) {
        return new JAXBElement<GetUserLikeArtistResponse>(_GetUserLikeArtistResponse_QNAME, GetUserLikeArtistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArtist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getArtist")
    public JAXBElement<GetArtist> createGetArtist(GetArtist value) {
        return new JAXBElement<GetArtist>(_GetArtist_QNAME, GetArtist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecommendation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getRecommendation")
    public JAXBElement<GetRecommendation> createGetRecommendation(GetRecommendation value) {
        return new JAXBElement<GetRecommendation>(_GetRecommendation_QNAME, GetRecommendation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserLikeArtist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getUserLikeArtist")
    public JAXBElement<GetUserLikeArtist> createGetUserLikeArtist(GetUserLikeArtist value) {
        return new JAXBElement<GetUserLikeArtist>(_GetUserLikeArtist_QNAME, GetUserLikeArtist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "createUserResponse")
    public JAXBElement<CreateUserResponse> createCreateUserResponse(CreateUserResponse value) {
        return new JAXBElement<CreateUserResponse>(_CreateUserResponse_QNAME, CreateUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserLikeArtist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "deleteUserLikeArtist")
    public JAXBElement<DeleteUserLikeArtist> createDeleteUserLikeArtist(DeleteUserLikeArtist value) {
        return new JAXBElement<DeleteUserLikeArtist>(_DeleteUserLikeArtist_QNAME, DeleteUserLikeArtist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "initDB")
    public JAXBElement<InitDB> createInitDB(InitDB value) {
        return new JAXBElement<InitDB>(_InitDB_QNAME, InitDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRatingArtist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "addRatingArtist")
    public JAXBElement<AddRatingArtist> createAddRatingArtist(AddRatingArtist value) {
        return new JAXBElement<AddRatingArtist>(_AddRatingArtist_QNAME, AddRatingArtist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getAllUserResponse")
    public JAXBElement<GetAllUserResponse> createGetAllUserResponse(GetAllUserResponse value) {
        return new JAXBElement<GetAllUserResponse>(_GetAllUserResponse_QNAME, GetAllUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRatingSongResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "addRatingSongResponse")
    public JAXBElement<AddRatingSongResponse> createAddRatingSongResponse(AddRatingSongResponse value) {
        return new JAXBElement<AddRatingSongResponse>(_AddRatingSongResponse_QNAME, AddRatingSongResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLikedSongs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getLikedSongs")
    public JAXBElement<GetLikedSongs> createGetLikedSongs(GetLikedSongs value) {
        return new JAXBElement<GetLikedSongs>(_GetLikedSongs_QNAME, GetLikedSongs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSongResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "deleteSongResponse")
    public JAXBElement<DeleteSongResponse> createDeleteSongResponse(DeleteSongResponse value) {
        return new JAXBElement<DeleteSongResponse>(_DeleteSongResponse_QNAME, DeleteSongResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitSongs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "initSongs")
    public JAXBElement<InitSongs> createInitSongs(InitSongs value) {
        return new JAXBElement<InitSongs>(_InitSongs_QNAME, InitSongs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteArtist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "deleteArtist")
    public JAXBElement<DeleteArtist> createDeleteArtist(DeleteArtist value) {
        return new JAXBElement<DeleteArtist>(_DeleteArtist_QNAME, DeleteArtist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllArtist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getAllArtist")
    public JAXBElement<GetAllArtist> createGetAllArtist(GetAllArtist value) {
        return new JAXBElement<GetAllArtist>(_GetAllArtist_QNAME, GetAllArtist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "deleteUserResponse")
    public JAXBElement<DeleteUserResponse> createDeleteUserResponse(DeleteUserResponse value) {
        return new JAXBElement<DeleteUserResponse>(_DeleteUserResponse_QNAME, DeleteUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSongResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getSongResponse")
    public JAXBElement<GetSongResponse> createGetSongResponse(GetSongResponse value) {
        return new JAXBElement<GetSongResponse>(_GetSongResponse_QNAME, GetSongResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLikedArtists }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getLikedArtists")
    public JAXBElement<GetLikedArtists> createGetLikedArtists(GetLikedArtists value) {
        return new JAXBElement<GetLikedArtists>(_GetLikedArtists_QNAME, GetLikedArtists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "createUser")
    public JAXBElement<CreateUser> createCreateUser(CreateUser value) {
        return new JAXBElement<CreateUser>(_CreateUser_QNAME, CreateUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDislikedSongs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getDislikedSongs")
    public JAXBElement<GetDislikedSongs> createGetDislikedSongs(GetDislikedSongs value) {
        return new JAXBElement<GetDislikedSongs>(_GetDislikedSongs_QNAME, GetDislikedSongs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "deleteUser")
    public JAXBElement<DeleteUser> createDeleteUser(DeleteUser value) {
        return new JAXBElement<DeleteUser>(_DeleteUser_QNAME, DeleteUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getAllUser")
    public JAXBElement<GetAllUser> createGetAllUser(GetAllUser value) {
        return new JAXBElement<GetAllUser>(_GetAllUser_QNAME, GetAllUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSongResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getAllSongResponse")
    public JAXBElement<GetAllSongResponse> createGetAllSongResponse(GetAllSongResponse value) {
        return new JAXBElement<GetAllSongResponse>(_GetAllSongResponse_QNAME, GetAllSongResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSongsFromArtist }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getSongsFromArtist")
    public JAXBElement<GetSongsFromArtist> createGetSongsFromArtist(GetSongsFromArtist value) {
        return new JAXBElement<GetSongsFromArtist>(_GetSongsFromArtist_QNAME, GetSongsFromArtist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getUser")
    public JAXBElement<GetUser> createGetUser(GetUser value) {
        return new JAXBElement<GetUser>(_GetUser_QNAME, GetUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRecommendationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getRecommendationResponse")
    public JAXBElement<GetRecommendationResponse> createGetRecommendationResponse(GetRecommendationResponse value) {
        return new JAXBElement<GetRecommendationResponse>(_GetRecommendationResponse_QNAME, GetRecommendationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSongsFromArtistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getSongsFromArtistResponse")
    public JAXBElement<GetSongsFromArtistResponse> createGetSongsFromArtistResponse(GetSongsFromArtistResponse value) {
        return new JAXBElement<GetSongsFromArtistResponse>(_GetSongsFromArtistResponse_QNAME, GetSongsFromArtistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteArtistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "deleteArtistResponse")
    public JAXBElement<DeleteArtistResponse> createDeleteArtistResponse(DeleteArtistResponse value) {
        return new JAXBElement<DeleteArtistResponse>(_DeleteArtistResponse_QNAME, DeleteArtistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLikedArtistsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getLikedArtistsResponse")
    public JAXBElement<GetLikedArtistsResponse> createGetLikedArtistsResponse(GetLikedArtistsResponse value) {
        return new JAXBElement<GetLikedArtistsResponse>(_GetLikedArtistsResponse_QNAME, GetLikedArtistsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRatingSong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "addRatingSong")
    public JAXBElement<AddRatingSong> createAddRatingSong(AddRatingSong value) {
        return new JAXBElement<AddRatingSong>(_AddRatingSong_QNAME, AddRatingSong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllArtistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getAllArtistResponse")
    public JAXBElement<GetAllArtistResponse> createGetAllArtistResponse(GetAllArtistResponse value) {
        return new JAXBElement<GetAllArtistResponse>(_GetAllArtistResponse_QNAME, GetAllArtistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDislikedArtistsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getDislikedArtistsResponse")
    public JAXBElement<GetDislikedArtistsResponse> createGetDislikedArtistsResponse(GetDislikedArtistsResponse value) {
        return new JAXBElement<GetDislikedArtistsResponse>(_GetDislikedArtistsResponse_QNAME, GetDislikedArtistsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getUserResponse")
    public JAXBElement<GetUserResponse> createGetUserResponse(GetUserResponse value) {
        return new JAXBElement<GetUserResponse>(_GetUserResponse_QNAME, GetUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserLikeSong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "deleteUserLikeSong")
    public JAXBElement<DeleteUserLikeSong> createDeleteUserLikeSong(DeleteUserLikeSong value) {
        return new JAXBElement<DeleteUserLikeSong>(_DeleteUserLikeSong_QNAME, DeleteUserLikeSong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getAllSong")
    public JAXBElement<GetAllSong> createGetAllSong(GetAllSong value) {
        return new JAXBElement<GetAllSong>(_GetAllSong_QNAME, GetAllSong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getSong")
    public JAXBElement<GetSong> createGetSong(GetSong value) {
        return new JAXBElement<GetSong>(_GetSong_QNAME, GetSong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "deleteSong")
    public JAXBElement<DeleteSong> createDeleteSong(DeleteSong value) {
        return new JAXBElement<DeleteSong>(_DeleteSong_QNAME, DeleteSong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserLikeSong }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getUserLikeSong")
    public JAXBElement<GetUserLikeSong> createGetUserLikeSong(GetUserLikeSong value) {
        return new JAXBElement<GetUserLikeSong>(_GetUserLikeSong_QNAME, GetUserLikeSong.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetArtistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getArtistResponse")
    public JAXBElement<GetArtistResponse> createGetArtistResponse(GetArtistResponse value) {
        return new JAXBElement<GetArtistResponse>(_GetArtistResponse_QNAME, GetArtistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLikedSongsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getLikedSongsResponse")
    public JAXBElement<GetLikedSongsResponse> createGetLikedSongsResponse(GetLikedSongsResponse value) {
        return new JAXBElement<GetLikedSongsResponse>(_GetLikedSongsResponse_QNAME, GetLikedSongsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddRatingArtistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "addRatingArtistResponse")
    public JAXBElement<AddRatingArtistResponse> createAddRatingArtistResponse(AddRatingArtistResponse value) {
        return new JAXBElement<AddRatingArtistResponse>(_AddRatingArtistResponse_QNAME, AddRatingArtistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitSongsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "initSongsResponse")
    public JAXBElement<InitSongsResponse> createInitSongsResponse(InitSongsResponse value) {
        return new JAXBElement<InitSongsResponse>(_InitSongsResponse_QNAME, InitSongsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDislikedArtists }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getDislikedArtists")
    public JAXBElement<GetDislikedArtists> createGetDislikedArtists(GetDislikedArtists value) {
        return new JAXBElement<GetDislikedArtists>(_GetDislikedArtists_QNAME, GetDislikedArtists.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUserLikeSongResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getUserLikeSongResponse")
    public JAXBElement<GetUserLikeSongResponse> createGetUserLikeSongResponse(GetUserLikeSongResponse value) {
        return new JAXBElement<GetUserLikeSongResponse>(_GetUserLikeSongResponse_QNAME, GetUserLikeSongResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InitDBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "initDBResponse")
    public JAXBElement<InitDBResponse> createInitDBResponse(InitDBResponse value) {
        return new JAXBElement<InitDBResponse>(_InitDBResponse_QNAME, InitDBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserLikeArtistResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "deleteUserLikeArtistResponse")
    public JAXBElement<DeleteUserLikeArtistResponse> createDeleteUserLikeArtistResponse(DeleteUserLikeArtistResponse value) {
        return new JAXBElement<DeleteUserLikeArtistResponse>(_DeleteUserLikeArtistResponse_QNAME, DeleteUserLikeArtistResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteUserLikeSongResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "deleteUserLikeSongResponse")
    public JAXBElement<DeleteUserLikeSongResponse> createDeleteUserLikeSongResponse(DeleteUserLikeSongResponse value) {
        return new JAXBElement<DeleteUserLikeSongResponse>(_DeleteUserLikeSongResponse_QNAME, DeleteUserLikeSongResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDislikedSongsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.project/", name = "getDislikedSongsResponse")
    public JAXBElement<GetDislikedSongsResponse> createGetDislikedSongsResponse(GetDislikedSongsResponse value) {
        return new JAXBElement<GetDislikedSongsResponse>(_GetDislikedSongsResponse_QNAME, GetDislikedSongsResponse.class, null, value);
    }

}
