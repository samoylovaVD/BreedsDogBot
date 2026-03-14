package models;

public class UserProfile { //объявляем поля класса
    private int activityPreference;
    private boolean hasAllergy;
    private boolean hasChildren;
    private DogSize preferredDogSize;
    private DogRole preferredDogRole;
    private String livingSpace;
    private boolean willingToTrain;
    private boolean needGoodWithAnimals;
    private int groomingFrequency;

    public UserProfile() {
        reset();
    } //вызывем метод кот инициализирует все поля по умолчанию

    public void reset() {
        this.activityPreference = 0; //не выбрано
        this.hasAllergy = false; //нет аллергии
        this.hasChildren = false; //нет детей
        this.preferredDogSize = null; //размер отсутст
        this.preferredDogRole = null; //роль отстут
        this.livingSpace = ""; //тип жилья не выбран
        this.willingToTrain = false; //не готтов дрессировать
        this.needGoodWithAnimals = false; //не нужно ладить с др животными
        this.groomingFrequency = 0; //уход не выбран
    }

    public boolean isComplete() { //метод проверяющ пройден ли тест
        return activityPreference != 0 &&
                livingSpace != null && !livingSpace.isEmpty() &&
                preferredDogRole != null &&
                preferredDogSize != null &&
                groomingFrequency != 0;
    }

    public int getActivityPreference() { return activityPreference; }
    public void setActivityPreference(int activityPreference) {
        this.activityPreference = activityPreference;
    }

    public boolean hasAllergy() { return hasAllergy; }
    public void setHasAllergy(boolean hasAllergy) {
        this.hasAllergy = hasAllergy;
    }

    public boolean hasChildren() { return hasChildren; }
    public void setHasChildren(boolean hasChildren) {
        this.hasChildren = hasChildren;
    }

    public DogSize getPreferredDogSize() { return preferredDogSize; }
    public void setPreferredDogSize(DogSize preferredDogSize) {
        this.preferredDogSize = preferredDogSize;
    }

    public DogRole getPreferredDogRole() { return preferredDogRole; }
    public void setPreferredDogRole(DogRole preferredDogRole) {
        this.preferredDogRole = preferredDogRole;
    }

    public String getLivingSpace() { return livingSpace; }
    public void setLivingSpace(String livingSpace) {
        this.livingSpace = livingSpace;
    }

    public boolean isWillingToTrain() { return willingToTrain; }
    public void setWillingToTrain(boolean willingToTrain) {
        this.willingToTrain = willingToTrain;
    }

    public boolean needGoodWithAnimals() { return needGoodWithAnimals; }
    public void setNeedGoodWithAnimals(boolean needGoodWithAnimals) {
        this.needGoodWithAnimals = needGoodWithAnimals;
    }

    public int getGroomingFrequency() { return groomingFrequency; }
    public void setGroomingFrequency(int groomingFrequency) {
        this.groomingFrequency = groomingFrequency;
    }
}